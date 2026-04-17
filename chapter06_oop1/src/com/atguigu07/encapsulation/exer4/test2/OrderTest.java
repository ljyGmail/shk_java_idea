package com.atguigu07.encapsulation.exer4.test2;

import com.atguigu07.encapsulation.exer4.test1.Order;

/**
 * ClassName: OrderTest
 * Package: com.atguigu07.encapsulation.exer4.test2
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 17. 오후 11:43
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {

        Order order = new Order();

        // 调用属性
        order.orderPublic = 1;

        // 调用方法
        order.methodPublic();

        // 不能调用
        // order.orderPrivate = 1;
        // order.orderDefault = 1;

        // order.methodPrivate();
        // order.methodDefault();
    }
}
