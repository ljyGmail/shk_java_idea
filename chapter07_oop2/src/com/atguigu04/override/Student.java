package com.atguigu04.override;

public class Student extends Person {

    String school;

    public void study() {
        System.out.println("学生学习");
    }

    public void eat() {
        System.out.println("学生应该多吃有营养的食物");
    }

    public void show1() {
        System.out.println("age = " + getAge());
    }

    // 重写的针对于返回值类型的测试
    public int info() {
        return 2;
    }

    public Student info1() {
        return null;
    }

    public void sleep() {
        System.out.println("学生应该多睡，养大脑");
    }
}
