package com.example.ordercardlitho.litho.component

import android.text.Layout
import androidx.annotation.ColorRes
import com.facebook.litho.Component
import com.facebook.litho.ComponentContext
import com.facebook.litho.annotations.LayoutSpec
import com.facebook.litho.annotations.OnCreateLayout
import com.facebook.litho.annotations.Prop
import com.facebook.litho.widget.Text
import com.facebook.yoga.YogaAlign
import com.facebook.yoga.YogaEdge

@LayoutSpec
object CCButtonTextSpec  {

    @OnCreateLayout
    fun OnCreateLayout(c: ComponentContext, @Prop text: String,
                       @ColorRes @Prop(optional = true) textColor: Int = android.R.color.black) : Component =
        Text.create(c)
        .text(text)
        .textSizeDip(16f)
        .textColorRes(textColor)
        .textAlignment(Layout.Alignment.ALIGN_CENTER)
        .alignSelf(YogaAlign.CENTER)
        .paddingDip(YogaEdge.ALL, 8f)
        .build()
}