package com.example.ordercardlitho.litho.section

import com.example.ordercardlitho.litho.component.ordercard.OrderCard
import com.example.ordercardlitho.litho.model.OrderWrapper
import com.example.ordercardlitho.litho.section.OrderCardListSectionSpec.render
import com.facebook.litho.Column
import com.facebook.litho.annotations.FromEvent
import com.facebook.litho.annotations.OnEvent
import com.facebook.litho.annotations.State
import com.facebook.litho.sections.Children
import com.facebook.litho.sections.SectionContext
import com.facebook.litho.sections.annotations.GroupSectionSpec
import com.facebook.litho.sections.annotations.OnCreateChildren
import com.facebook.litho.sections.common.DataDiffSection
import com.facebook.litho.sections.common.OnCheckIsSameItemEvent
import com.facebook.litho.sections.common.RenderEvent
import com.facebook.litho.widget.Card
import com.facebook.litho.widget.ComponentRenderInfo
import com.facebook.litho.widget.RenderInfo

@GroupSectionSpec
object OrderCardListSectionSpec  {

    @OnCreateChildren
    fun onCreateChildren(c: SectionContext, @State orderWrapperList: List<OrderWrapper>): Children {
        val children = Children.create()

        children.child(
            DataDiffSection.create<OrderWrapper>(c)
                .data(orderWrapperList)
                .renderEventHandler(OrderCardListSection.render(c))
                .onCheckIsSameItemEventHandler(OrderCardListSection.isSameItem(c))
        )

        return children.build()
    }

    @OnEvent(RenderEvent::class)
    fun render(c: SectionContext, @FromEvent model: OrderWrapper) : RenderInfo {
        return ComponentRenderInfo.create().component(
            Card.create(c)
                .cornerRadiusDip(4f)
                .elevationDip(2f)
                .content(
                    Column.create(c)
                        .child(OrderCardHeaderSection.create(c).order(model.order).build())
                        .child(OrderCardContentSection.create(c).build())

                )
        ).build()
    }


    @OnEvent(OnCheckIsSameItemEvent::class)
    fun isSameItem(c: SectionContext, @FromEvent previousItem: OrderWrapper, @FromEvent nextItem: OrderWrapper) : Boolean = false
}