package com.facebook.flipper.noopdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.flipper.android.AndroidFlipperClient
import com.facebook.flipper.android.utils.FlipperUtils
import com.facebook.flipper.core.FlipperClient
import com.facebook.flipper.plugins.inspector.DescriptorMapping
import com.facebook.flipper.plugins.inspector.InspectorFlipperPlugin
import com.facebook.flipper.plugins.network.FlipperOkhttpInterceptor
import com.facebook.flipper.plugins.network.NetworkFlipperPlugin
import com.facebook.soloader.SoLoader

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)


  }



  fun initFlipper(){

    val networkFlipperPlugin = NetworkFlipperPlugin()
    val flipperOkhttpInterceptor  =  FlipperOkhttpInterceptor(networkFlipperPlugin)

    if (BuildConfig.DEBUG && FlipperUtils.shouldEnableFlipper(this)) {
      SoLoader.init(this, false)
      val client: FlipperClient = AndroidFlipperClient.getInstance(this)
      client.addPlugin(InspectorFlipperPlugin(this, DescriptorMapping.withDefaults()))
      client.addPlugin(networkFlipperPlugin)
      client.start()
    }
  }
}