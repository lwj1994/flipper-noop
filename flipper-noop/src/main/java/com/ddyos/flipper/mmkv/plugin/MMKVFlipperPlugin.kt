package com.ddyos.flipper.mmkv.plugin

import com.facebook.flipper.core.FlipperPlugin

/**
 * @author luwenjie on 2022/8/3 16:54:42
 */
class MMKVFlipperPlugin @JvmOverloads constructor(
    name: String = "",
    mode: kotlin.Int = 0,
    cryptKey: kotlin.String? = null
) : FlipperPlugin {

    constructor(descriptors: List<MMKVDescriptor> = emptyList()) : this("", 0, null)

    companion object {
        private const val TAG = "MMKVFlipperPlugin"
    }
}
