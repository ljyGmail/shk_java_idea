package com.atguigu07.encapsulation.exer4.test1;

/**
 * ClassName: OrderTest
 * Package: com.atguigu07.encapsulation.exer4.test1
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 17. 오후 11:41
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        // 调用属性
        order.orderDefault = 1;
        order.orderPublic = 2;

        // 调用方法
        order.methodDefault();
        order.methodPublic();

        // 不能调用
        // order.orderPrivate = 3;
        // order.methodPrivate();
    }
}
