/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.flipper.plugins.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import com.facebook.flipper.core.FlipperConnection;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperPlugin;
import java.util.List;

public class SharedPreferencesFlipperPlugin implements FlipperPlugin {

  public SharedPreferencesFlipperPlugin(Context context) {
  }

  /**
   * Creates a {@link android.content.SharedPreferences} plugin for Flipper
   *
   * @param context The context to retrieve the file from. Will use the name as the file name with
   * {@link Context#MODE_PRIVATE}.
   * @param name The preference file name.
   */
  public SharedPreferencesFlipperPlugin(Context context, String name) {
  }

  /**
   * Creates a {@link android.content.SharedPreferences} plugin for Flipper
   *
   * @param context The context to retrieve the file from.
   * @param name The preference file name.
   * @param mode The Context mode to utilize.
   */
  public SharedPreferencesFlipperPlugin(Context context, String name, int mode) {
  }

  /**
   * Creates a {@link android.content.SharedPreferences} plugin for Flipper
   *
   * @param context The context to retrieve the preferences from.
   * @param descriptors A list of {@link SharedPreferencesDescriptor}s that describe the list of
   * preferences to retrieve.
   */
  public SharedPreferencesFlipperPlugin(
      Context context, List<SharedPreferencesDescriptor> descriptors) {
  }

  public String getId() {
    return "Preferences";
  }

  private static List<SharedPreferencesDescriptor> buildDescriptorForAllPrefsFiles(
      Context context) {
    return null;
  }

  private static String getDefaultSharedPreferencesName(Context context) {
    return Build.VERSION.SDK_INT >= Build.VERSION_CODES.N
        ? PreferenceManager.getDefaultSharedPreferencesName(context)
        : context.getPackageName() + "_preferences";
  }

  private SharedPreferences getSharedPreferencesFor(String name) {
    return null;
  }

  private FlipperObject getFlipperObjectFor(String name) {
    return getFlipperObjectFor(getSharedPreferencesFor(name));
  }

  private FlipperObject getFlipperObjectFor(SharedPreferences sharedPreferences) {
    return null;
  }

  public void onConnect(FlipperConnection connection) {
  }

  public void onDisconnect() {
  }

  public boolean runInBackground() {
    return false;
  }

  public static class SharedPreferencesDescriptor {
    public final String name;
    public final int    mode;

    public SharedPreferencesDescriptor(String name, int mode) {
      this.name = name;
      this.mode = mode;
    }

    public SharedPreferences getSharedPreferences(Context context) {
      return context.getSharedPreferences(name, mode);
    }
  }
}
