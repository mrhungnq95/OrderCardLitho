package com.example.ordercardlitho.litho.component.orderdetail

import com.facebook.litho.KComponent
import com.facebook.litho.Row
import com.facebook.litho.dp
import com.facebook.litho.height
import com.facebook.litho.widget.Text


class OrderDetailComponent : KComponent({
    Row(style = height(50.dp)) {
        +Text("Món A")
    }
})