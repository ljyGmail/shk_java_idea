package com.atguigu03._extends;

public class Student extends Person {

    // 属性
    // String name;
    // int age;

    String school;

    // 方法
    // public void eat() {
    //     System.out.println("人吃饭");
    // }

    // public void sleep() {
    //     System.out.println("人睡觉");
    // }

    public void study() {
        System.out.println("学生学习");
    }

    public void show1() {
        // System.out.println("age = " + age);
        System.out.println("age = " + getAge());
    }
}
