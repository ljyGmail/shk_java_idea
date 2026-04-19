package com.atguigu04.override.test2;

import com.atguigu04.override.test1.Order;

public class OrderTest {
    public void method() {
        Order order = new Order();

        order.orderPublic = 1;
        order.methodPublic();

        // 不能访问
        // order.orderDefault = 3;
        // order.orderProtected = 2;
        // order.orderPrivate = 4;

        // order.methodDefault();
        // order.methodProtected();
        // order.methodPrivate();
    }
}
