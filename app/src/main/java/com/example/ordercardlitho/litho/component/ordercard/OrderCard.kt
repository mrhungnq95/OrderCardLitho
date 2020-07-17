package com.example.ordercardlitho.litho.component.ordercard

import com.example.ordercardlitho.litho.model.OrderWrapper
import com.facebook.litho.*
import com.facebook.litho.widget.Card

class OrderCard(orderWrapper: OrderWrapper) : KComponent({
    Column(style = padding(all = 8.dp) + flex(shrink = 1f) ) {
        +Card(cornerRadius = 4.dp, elevation = 2.dp) {
            OrderCardComponent(orderWrapper = orderWrapper)
        }
    }
})