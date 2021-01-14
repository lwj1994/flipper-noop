package com.facebook.flipper.android

import android.content.Context

object AndroidFlipperClient {
    @JvmStatic
    fun getInstance(context: Context) = NoOpAndroidFlipperClient()

    fun getInstanceIfInitialized() = NoOpAndroidFlipperClient()
}