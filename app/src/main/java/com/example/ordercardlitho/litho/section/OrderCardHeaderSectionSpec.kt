package com.example.ordercardlitho.litho.section

import com.example.ordercardlitho.litho.model.Order
import com.example.ordercardlitho.litho.model.OrderWrapper
import com.facebook.litho.Column
import com.facebook.litho.Component
import com.facebook.litho.ComponentContext
import com.facebook.litho.Row
import com.facebook.litho.annotations.LayoutSpec
import com.facebook.litho.annotations.OnCreateLayout
import com.facebook.litho.annotations.Prop
import com.facebook.litho.widget.Text

@LayoutSpec
object OrderCardHeaderSectionSpec {

    @OnCreateLayout
    fun onCreateLayout(c: ComponentContext, @Prop order: Order) : Component {
        return Column.create(c)
            .flexShrink(1f)
            .child(
                Row.create(c)
                    .child(Text.create(c).text("Order No"))
                    .child(Text.create(c).text("10.1"))
            )
            .build()
    }
}