package com.example.ordercardlitho.litho.component

import android.view.View
import androidx.annotation.ColorRes
import com.facebook.litho.*
import com.facebook.litho.annotations.*
import com.facebook.litho.widget.Card
import com.facebook.yoga.YogaAlign
import com.facebook.yoga.YogaJustify


@LayoutSpec
object CCButtonSpec {

    interface OnButtonClickListener {
        fun onButtonClick()
    }

    @OnCreateLayout
    fun OnCreateLayout(c: ComponentContext,
                       @Prop text: String,
                       @ColorRes @Prop colorButton: Int, @ColorRes
                       @Prop(optional = true) textColorButton: Int) : Component =
        Row.create(c)
        .alignContent(YogaAlign.CENTER)
        .justifyContent(YogaJustify.CENTER)
        .child(
            Card.create(c)
                .widthDip(100f)
                .elevationDip(2f)
                .cornerRadiusDip(4f)
                .cardBackgroundColorRes(colorButton)
                .content(
                    CCButtonText.create(c).text(text).textColor(textColorButton)
                ).flexShrink(1f)
                .alignSelf(YogaAlign.CENTER)
        ).clickHandler(CCButton.onClick(c))
            .build()


    @OnEvent(ClickEvent::class)
    fun onClick(
        c: ComponentContext?, @FromEvent view: View?,
        @Prop listener: OnButtonClickListener
    ) {
        listener.onButtonClick()
    }
}