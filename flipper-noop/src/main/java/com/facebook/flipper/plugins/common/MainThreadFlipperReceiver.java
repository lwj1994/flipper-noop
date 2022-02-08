/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.flipper.plugins.common;

import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperReceiver;
import com.facebook.flipper.core.FlipperResponder;

public abstract class MainThreadFlipperReceiver implements FlipperReceiver {

  @Override
  public final void onReceive(final FlipperObject params, final FlipperResponder responder) {
  }

  private static String getStackTraceString(Throwable th) {
    return "";
  }

  public abstract void onReceiveOnMainThread(FlipperObject params, FlipperResponder responder);
}
