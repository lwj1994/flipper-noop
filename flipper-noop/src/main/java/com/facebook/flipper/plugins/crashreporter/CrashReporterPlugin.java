/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.flipper.plugins.crashreporter;

import android.app.Activity;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperPlugin;

public class CrashReporterPlugin implements FlipperPlugin {
  private CrashReporterPlugin() {
  }

  // static method to create instance of Singleton class
  public static CrashReporterPlugin getInstance() {
    return new CrashReporterPlugin();
  }

  /*
   * Activity to be used to display incoming messages
   */
  public void setActivity(Activity activity) {

  }

  public void onConnect(FlipperConnection connection) {
  }

  public void sendExceptionMessage(Thread paramThread, Throwable paramThrowable) {
  }

  public void onDisconnect() {
  }

  public boolean runInBackground() {
    return true;
  }

  public String getId() {
    return "123123";
  }
}
