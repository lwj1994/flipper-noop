package com.facebook.flipper.core

interface FlipperClient {

    fun addPlugin(plugin: FlipperPlugin)

    fun start()

}