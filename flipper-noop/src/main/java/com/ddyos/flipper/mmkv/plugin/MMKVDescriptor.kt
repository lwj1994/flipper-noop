package com.ddyos.flipper.mmkv.plugin

/**
 * @author luwenjie on 2022/8/3 16:57:05
 */
class MMKVDescriptor(val name: String, val mode: Int, val cryptKey: String?) {

    companion object {
        private const val TAG = "MMKVDescriptor"
    }
}
