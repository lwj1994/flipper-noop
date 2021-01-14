package com.facebook.flipper.android;

import androidx.annotation.Nullable;

import com.facebook.flipper.core.FlipperClient;
import com.facebook.flipper.core.FlipperPlugin;

public class NoOpAndroidFlipperClient implements FlipperClient {

    @Override
    public void addPlugin(FlipperPlugin plugin) {
        // no-op
    }

    @Nullable
    @Override
    public <T extends FlipperPlugin> T getPlugin(String id) {
        return null;
    }

    @Nullable
    @Override
    public <T extends FlipperPlugin> T getPluginByClass(Class<T> cls) {
        return null;
    }

    @Override
    public void removePlugin(FlipperPlugin plugin) {
        // no-op
    }

    @Override
    public void start() {
        // no-op
    }

    @Override
    public void stop() {
        // no-op
    }

    @Override
    public void unsubscribe() {
        // no-op
    }
}