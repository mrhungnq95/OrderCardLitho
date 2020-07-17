package com.example.ordercardlitho

import android.app.Application
import com.facebook.litho.ComponentsReporter
import com.facebook.soloader.SoLoader

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        SoLoader.init(this, false)
    }
}