package com.viam.sdk.android;

import android.content.Context;

import com.viam.sdk.core.Channel;
import com.viam.sdk.core.DialOptions;
import com.viam.sdk.core.webrtc.PeerConnection;

import org.webrtc.EglBase;
import org.webrtc.MediaStream;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class Dialer extends com.viam.sdk.core.Dialer<MediaStream, PeerConnectionFactory> {
    public Dialer(final Context applicationContext) {
        super(new PeerConnectionFactory(applicationContext));
    }

    @Override
    public CompletableFuture<Channel> dialWebRTC(
            final String signalingAddress,
            final String host,
            final DialOptions opts
    ) {
        return dialWebRTC(signalingAddress, host, opts, null);
    }

    public CompletableFuture<Channel> dialWebRTC(
            final String signalingAddress,
            final String host,
            final DialOptions opts,
            final PeerConnection.MediaStreamObserver<MediaStream> mediaStreamObserver
    ) {
        final Executor executor = Executors.newCachedThreadPool(Executors.defaultThreadFactory());
        return this.dialWebRTC(
                signalingAddress,
                host,
                opts,
                executor,
                mediaStreamObserver,
                Logger.getLogger(Dialer.class.getName())
        );
    }

    public EglBase getEGLBase() {
        return this.getPeerConnectionFactory().getEGLBase();
    }
}
