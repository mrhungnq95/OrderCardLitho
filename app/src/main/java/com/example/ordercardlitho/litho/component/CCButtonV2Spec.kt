package com.example.ordercardlitho.litho.component

import com.example.ordercardlitho.litho.component.CCButton.onClick
import com.facebook.litho.*
import com.facebook.litho.annotations.*
import com.facebook.litho.annotations.State
import com.facebook.litho.widget.Text
import com.facebook.yoga.YogaAlign
import com.facebook.yoga.YogaEdge


@LayoutSpec
object CCButtonV2Spec {


    @OnCreateLayout
    fun onCreateLayout(c: ComponentContext, @State counter: Int) : Component  {

        val button = SystemButton.create(c)
            .widthDip(100f)
            .heightDip(48f)
            .marginDip(YogaEdge.RIGHT, 16f)
            .clickHandler(CCButtonV2.onButtonClick(c))
            .build();

        val text = Text.create(c)
            .text(counter.toString())
            .textSizeSp(16f)
            .build()

        return Row.create(c)
            .child(button)
            .child(text)
            .heightDip(50f)
            .alignItems(YogaAlign.CENTER)
            .build();

    }

    @OnEvent(ClickEvent::class)
    fun onButtonClick(c: ComponentContext?) {
        CCButtonV2.updateCountAsync(c)
    }

    @OnUpdateState
    fun updateCount(counter: StateValue<Int>) {
        counter.set(counter.get()?.plus(1))
    }
}