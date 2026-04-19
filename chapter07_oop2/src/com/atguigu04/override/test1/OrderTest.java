package com.atguigu04.override.test1;

public class OrderTest {

    public void method1(){
        Order order = new Order();

        // 通过对象调用Order类中声明的属性、方法。
        order.orderDefault = 2;
        order.orderProtected = 3;
        order.orderPublic = 4;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        // 受封装性的影响，不能调用。
        // order.orderPrivate = 1;
        // order.methodPrivate();
    }
}
