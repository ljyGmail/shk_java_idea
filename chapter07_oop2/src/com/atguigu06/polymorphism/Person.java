package com.atguigu06.polymorphism;

/**
 * ClassName: Person
 * Package: com.atguigu06.polymorphism
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 21. 오후 9:31
 * @Version 1.0
 */
public class Person {
    String name;
    int age;

    int id = 1001;

    public void eat() {
        System.out.println("人吃饭");
    }

    public void walk() {
        System.out.println("人走路");
    }

}
