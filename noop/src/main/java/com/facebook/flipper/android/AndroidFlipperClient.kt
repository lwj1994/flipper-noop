package com.facebook.flipper.android

import android.content.Context
import com.facebook.flipper.core.FlipperClient
import com.facebook.flipper.core.FlipperPlugin

object AndroidFlipperClient {

    fun getInstance(context: Context) = object : FlipperClient {
        override fun addPlugin(plugin: FlipperPlugin) {

        }

        override fun start() {
        }

    }
}