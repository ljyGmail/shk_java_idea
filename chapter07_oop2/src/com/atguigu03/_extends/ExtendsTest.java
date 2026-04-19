package com.atguigu03._extends;

public class ExtendsTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Tony";
        // p1.age = 12;
        p1.eat();

        System.out.println(p1.toString());

        Student s1 = new Student();
        s1.name = "Tom";
        // s1.age = 12;
        s1.eat();

        // 超纲: 获取s1所属类的父类
        System.out.println(s1.getClass().getSuperclass()); // class com.atguigu03._extends.Person
        // 超纲: 获取p1所属类的父类
        System.out.println(p1.getClass().getSuperclass()); // class java.lang.Object
    }
}
