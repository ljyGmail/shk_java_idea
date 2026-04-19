package com.atguigu04.override.test2;

import com.atguigu04.override.test1.Order;

public class SubOrder extends Order {

    public void method() {
        orderProtected = 1;
        orderPublic = 2;

        methodProtected();
        methodPublic();

        // 不能访问
        // orderPrivate = 3;
        // orderDefault = 4;
        // methodPrivate();
        // methodDefault();
    }

}
