package com.example.ordercardlitho.litho.component

import android.content.Context
import android.widget.Button
import com.facebook.litho.ComponentContext
import com.facebook.litho.annotations.MountSpec
import com.facebook.litho.annotations.OnCreateMountContent
import com.facebook.litho.annotations.OnMount

@MountSpec
object SystemButtonSpec {

    @OnCreateMountContent
    fun OnCreateMountContent(c: Context) : Button =  Button(c)

    @OnMount
    fun onMount(c: ComponentContext, button: Button) {
        button.text = "Counter"
    }
}