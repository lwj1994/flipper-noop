/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.flipper.plugins.databases;

import android.content.Context;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperPlugin;
import java.util.List;

public class DatabasesFlipperPlugin implements FlipperPlugin {

  private static final String ID = "Databases";

  public DatabasesFlipperPlugin(Context context) {
  }

  public DatabasesFlipperPlugin(DatabaseDriver databaseDriver) {
  }

  public DatabasesFlipperPlugin(List<DatabaseDriver> databaseDriverList) {
  }

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
