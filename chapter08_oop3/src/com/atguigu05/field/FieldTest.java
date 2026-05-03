package com.atguigu05.field;

public class FieldTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);
    }
}

class Order {

    {
        orderId = 2;
    }

    int orderId = 1;

    public Order() {
        orderId = 3;
    }

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public void eat() {
        sleep();
    }

    public void sleep() {
    }
}
