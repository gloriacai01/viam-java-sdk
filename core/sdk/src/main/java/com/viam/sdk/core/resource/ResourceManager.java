package com.viam.sdk.core.resource;

import com.viam.common.v1.Common;
import com.viam.common.v1.Common.ResourceName;
import com.viam.component.board.v1.BoardServiceGrpc;
import com.viam.component.camera.v1.CameraServiceGrpc;
import com.viam.component.generic.v1.GenericServiceGrpc;
import com.viam.component.gripper.v1.GripperServiceGrpc;
import com.viam.component.motor.v1.MotorServiceGrpc;
import com.viam.component.movementsensor.v1.MovementSensorServiceGrpc;
import com.viam.component.sensor.v1.SensorServiceGrpc;
import com.viam.sdk.core.component.board.Board;
import com.viam.sdk.core.component.board.BoardRPCClient;
import com.viam.sdk.core.component.board.BoardRPCService;
import com.viam.sdk.core.component.camera.Camera;
import com.viam.sdk.core.component.camera.CameraRPCClient;
import com.viam.sdk.core.component.camera.CameraRPCService;
import com.viam.sdk.core.component.generic.Generic;
import com.viam.sdk.core.component.generic.GenericRPCClient;
import com.viam.sdk.core.component.generic.GenericRPCService;
import com.viam.sdk.core.component.gripper.Gripper;
import com.viam.sdk.core.component.gripper.GripperRPCClient;
import com.viam.sdk.core.component.gripper.GripperRPCService;
import com.viam.sdk.core.component.motor.Motor;
import com.viam.sdk.core.component.motor.MotorRPCClient;
import com.viam.sdk.core.component.motor.MotorRPCService;
import com.viam.sdk.core.component.movementsensor.MovementSensor;
import com.viam.sdk.core.component.movementsensor.MovementSensorRPCClient;
import com.viam.sdk.core.component.movementsensor.MovementSensorRPCService;
import com.viam.sdk.core.component.sensor.Sensor;
import com.viam.sdk.core.component.sensor.SensorRPCClient;
import com.viam.sdk.core.component.sensor.SensorRPCService;
import com.viam.sdk.core.exception.DuplicateResourceException;
import com.viam.sdk.core.exception.ResourceNotFoundException;
import com.viam.sdk.core.service.datamanager.DataManager;
import com.viam.sdk.core.service.datamanager.DataManagerRPCClient;
import com.viam.sdk.core.service.sensors.Sensors;
import com.viam.sdk.core.service.sensors.SensorsRPCClient;
import com.viam.service.datamanager.v1.DataManagerServiceGrpc;
import com.viam.service.sensors.v1.SensorsServiceGrpc;

import java.io.Closeable;
import java.util.*;
import java.util.logging.Logger;

/**
 * Manager containing all resources registered to this server.
 */
public class ResourceManager implements Closeable {

    private static final Logger LOGGER = Logger.getLogger(ResourceManager.class.getName());

    static {
        // register well-known subtypes
        // COMPONENTS
        Registry.registerSubtype(new ResourceRegistration<>(
                Board.getSUBTYPE(),
                BoardServiceGrpc.SERVICE_NAME,
                BoardRPCService::new,
                BoardRPCClient::new
        ));
        Registry.registerSubtype(new ResourceRegistration<>(
                Camera.SUBTYPE,
                CameraServiceGrpc.SERVICE_NAME,
                CameraRPCService::new,
                CameraRPCClient::new
        ));
        Registry.registerSubtype(new ResourceRegistration<>(
                Generic.SUBTYPE,
                GenericServiceGrpc.SERVICE_NAME,
                GenericRPCService::new,
                GenericRPCClient::new
        ));
        Registry.registerSubtype(new ResourceRegistration<>(
                Gripper.SUBTYPE,
                GripperServiceGrpc.SERVICE_NAME,
                GripperRPCService::new,
                GripperRPCClient::new
        ));
        Registry.registerSubtype(new ResourceRegistration<>(
                Motor.getSUBTYPE(),
                MotorServiceGrpc.SERVICE_NAME,
                MotorRPCService::new,
                MotorRPCClient::new
        ));
        Registry.registerSubtype(new ResourceRegistration<>(
                MovementSensor.SUBTYPE,
                MovementSensorServiceGrpc.SERVICE_NAME,
                MovementSensorRPCService::new,
                MovementSensorRPCClient::new
        ));
        Registry.registerSubtype(new ResourceRegistration<>(
                Sensor.SUBTYPE,
                SensorServiceGrpc.SERVICE_NAME,
                SensorRPCService::new,
                SensorRPCClient::new
        ));

        // SERVICES
        Registry.registerSubtype(new ResourceRegistration<>(
                DataManager.SUBTYPE,
                DataManagerServiceGrpc.SERVICE_NAME,
                DataManagerRPCClient::new
        ));
        Registry.registerSubtype(new ResourceRegistration<>(
                Sensors.SUBTYPE,
                SensorsServiceGrpc.SERVICE_NAME,
                SensorsRPCClient::new
        ));
    }

    protected final Map<Common.ResourceName, Resource> resources;
    final Map<String, List<Common.ResourceName>> shortToLongName = new HashMap<>();

    public ResourceManager(final List<Resource> resources) {
        this.resources = new HashMap<>();
        for (Resource resource : resources) {
            add(resource);
        }
    }

    /**
     * Adds a new resource with the manager. Resources may not have the same name. If a resource is
     * remote and the short name is unique, save a short name version.
     *
     * @param resource The resource to add
     */
    public synchronized void add(final Resource resource) throws DuplicateResourceException {
        Registry.lookupSubtype(resource.getSubtype());

        final Common.ResourceName name = resource.getName();
        if (resources.containsKey(name)) {
            throw new DuplicateResourceException(name);
        }

        final String shortName;
        if (name.getName().contains(":")) {
            final String[] parts = name.getName().split("-");
            shortName = parts[parts.length - 1];
        } else {
            shortName = name.getName();
        }

        if (shortToLongName.containsKey(shortName) && !shortToLongName.get(shortName).contains(name)) {
            shortToLongName.get(shortName).add(name);
        } else if (!shortToLongName.containsKey(shortName)) {
            shortToLongName.put(shortName, new ArrayList<>());
        }

        resources.put(name, resource);
    }

    /**
     * Return a resource from the manager. If a unique short name version is given, return a remote
     * resource with the name.
     *
     * @param name        The name of the resource
     * @param <ResourceT> The type of the resource
     * @return The resource
     */
    public synchronized <ResourceT> ResourceT getResource(Class<ResourceT> resourceClass,
                                                          Common.ResourceName name) {
        if (resources.containsKey(name)) {
            final Resource resourceRaw = resources.get(name);
            if (resourceClass.isAssignableFrom(resourceRaw.getClass())) {
                return resourceClass.cast(resourceRaw);
            }
        }
        if (shortToLongName.containsKey(name.getName())
                && shortToLongName.get(name.getName()).size() == 1) {
            return getResource(resourceClass, shortToLongName.get(name.getName()).get(0));
        }
        throw new ResourceNotFoundException(name.getSubtype(), name.getName());
    }

    /**
     * Remove the resource with the specified ResourceName.
     *
     * @param name The ResourceName of the resource
     */
    public synchronized void removeResource(final Common.ResourceName name) {
        if (!resources.containsKey(name)) {
            return;
        }
        try {
            final Resource resource = resources.get(name);
            resource.close();
        } finally {
            resources.remove(name);
        }
    }

    public synchronized boolean isManaging(Common.ResourceName name) {
        return resources.containsKey(name);
    }

    public synchronized Set<ResourceName> resourceNames() {
        return new HashSet<>(resources.keySet());
    }

    /**
     * Close the resource manager by removing all resources. Please note that any errors will not
     * throw an exception. Errors will still be logged.
     */
    @Override
    public synchronized void close() {
        for (Common.ResourceName name : resources.keySet()) {
            try {
                removeResource(name);
            } catch (final Throwable t) {
                LOGGER.severe(String.format("Error while closing %s: %s", name, t));
            }
        }
    }
}
