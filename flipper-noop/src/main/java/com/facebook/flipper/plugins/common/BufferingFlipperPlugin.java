/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.flipper.plugins.common;

import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperPlugin;

/**
 * Flipper plugin that keeps events in a buffer until a connection is available.
 *
 * <p>In order to send data to the {@link FlipperConnection}, use {@link #send(String,
 * FlipperObject)} instead of {@link FlipperConnection#send(String, FlipperObject)}.
 */
public abstract class BufferingFlipperPlugin implements FlipperPlugin {

  public synchronized void setConnectionListener(MockResponseConnectionListener listener) {
  }

  public synchronized void removeConnectionListener() {
  }

  public synchronized void onConnect(FlipperConnection connection) {
  }

  public synchronized void onDisconnect() {
  }

  public boolean runInBackground() {
    return true;
  }

  public synchronized FlipperConnection getConnection() {
    return null;
  }

  public synchronized boolean isConnected() {
    return false;
  }

  public synchronized void send(String method, FlipperObject flipperObject) {

  }

  private synchronized void sendBufferedEvents() {

  }

  private static class CachedFlipperEvent {
    final String        method;
    final FlipperObject flipperObject;

    private CachedFlipperEvent(String method, FlipperObject flipperObject) {
      this.method = method;
      this.flipperObject = flipperObject;
    }
  }

  public interface MockResponseConnectionListener {
    void onConnect(FlipperConnection connection);

    void onDisconnect();
  }
}
