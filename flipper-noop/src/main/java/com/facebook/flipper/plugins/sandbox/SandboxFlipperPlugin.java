/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.flipper.plugins.sandbox;

import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperPlugin;

public class SandboxFlipperPlugin implements FlipperPlugin {
  public static final String ID = "Sandbox";

  public String getId() {
    return ID;
  }

  public void onConnect(FlipperConnection connection) {
  }

  public void onDisconnect() {
  }

  public boolean runInBackground() {
    return false;
  }
}
