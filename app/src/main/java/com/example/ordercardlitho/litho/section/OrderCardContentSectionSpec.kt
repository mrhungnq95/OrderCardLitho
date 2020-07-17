package com.example.ordercardlitho.litho.section

import com.example.ordercardlitho.litho.component.orderdetail.OrderDetailComponent
import com.example.ordercardlitho.litho.model.OrderDetail
import com.facebook.litho.Component
import com.facebook.litho.ComponentContext
import com.facebook.litho.annotations.LayoutSpec
import com.facebook.litho.annotations.OnCreateLayout
import com.facebook.litho.annotations.Prop
import com.facebook.litho.sections.Children
import com.facebook.litho.sections.SectionContext
import com.facebook.litho.sections.annotations.GroupSectionSpec
import com.facebook.litho.sections.annotations.OnCreateChildren
import com.facebook.litho.sections.common.SingleComponentSection

@GroupSectionSpec
object OrderCardContentSectionSpec {

    @OnCreateChildren
    fun onCreateChildren(c: SectionContext, @Prop orderDetails: List<OrderDetail>)  : Children {
        val children = Children.create()

        return children.build()
    }
}