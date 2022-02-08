/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.flipper.plugins.navigation;

import androidx.annotation.Nullable;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperPlugin;
import java.util.Date;

public class NavigationFlipperPlugin implements FlipperPlugin {

  private NavigationFlipperPlugin() {
  }

  @Deprecated
  public void sendNavigationEvent(@Nullable String keyURI) {
    sendNavigationEvent(keyURI, null, null);
  }

  public void sendNavigationEvent(
      @Nullable String keyURI, @Nullable String className, @Nullable Date date) {
  }

  public String getId() {
    return "Navigation";
  }

  public void onConnect(FlipperConnection connection) throws Exception {
  }

  public void onDisconnect() throws Exception {
  }

  public boolean runInBackground() {
    return true;
  }

  public static NavigationFlipperPlugin getInstance() {
    return null;
  }
}
