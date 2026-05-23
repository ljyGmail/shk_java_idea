package com.atguigu05.exer.exer3;

/**
 * ClassName: Exer3
 * Package: com.atguigu05.exer.exer3
 * Description:
 *
 * @Author: ljy
 * @Create: 2026. 5. 23. 오후 1:29
 * @Version 1.0
 */
public class Exer3 {
    public static void main(String[] args) {

        // 1. 使用有参的构造器
        try {
            // Person p1 = new Person("Tom", 10);
            Person p1 = new Person("Tom", -10);
            System.out.println(p1);
        } catch (NoLifeValueException e) {
            System.out.println(e.getMessage());
        }

        // 2. 使用空参的构造器
        Person p2 = new Person();
        p2.setName("Jerry");
        // p2.setLifeValue(-10);
        p2.setLifeValue(10);
        System.out.println(p2);
    }
}
