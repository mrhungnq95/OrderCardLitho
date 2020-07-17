package com.example.ordercardlitho.litho.model

class OrderWrapper  {
    lateinit var order: Order
    var orderDetailList: List<OrderDetail> = mutableListOf()
}