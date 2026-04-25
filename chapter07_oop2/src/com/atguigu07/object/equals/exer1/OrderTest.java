package com.atguigu07.object.equals.exer1;

/**
 * ClassName: OrderTest
 * Package: com.atguigu07.object.equals.exer1
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 26. 오전 1:07
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001, "orderAA");
        Order order2 = new Order(1001, "orderAA");

        System.out.println(order1.equals(order2)); // true

        Order order3 = new Order(1002, new String("BB"));
        Order order4 = new Order(1002, new String("BB"));
        System.out.println(order3.equals(order4)); // true

        String str1 = "AA";
        String str2 = "AA";
        System.out.println(str1 == str2); // true
    }
}
