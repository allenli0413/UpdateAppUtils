package com.example.teprinciple.updateappdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class KotlinDemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_demo)
        findViewById(R.id.kotlin_btn).setOnClickListener {
            update()
        }
    }

    private fun update() {
        val apkPath: String = "http://issuecdn.baidupcs.com/issue/netdisk/apk/BaiduNetdisk_9.6.63.apk"
//        UpdateAppUtils
//            .serverVersionCode(2)
//            .serverVersionName("3.0")
//            .apkPath(apkPath)
//            .update(this)
    }
}
