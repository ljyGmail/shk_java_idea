package com.atguigu10._enum.exer1;

public class BankTest1 {
    public static void main(String[] args) {
        // Bank1.instance = null;
        System.out.println(GirlFriend.XIAO_LI); // XIAO_LI
    }
}

// JDK5.0之前使用枚举类定义单例模式
class Bank1 {

    private Bank1() {
    }

    public static final Bank1 instance = new Bank1();
}

// JDK5.0使用enum关键字定义枚举的方式类实现单例模式
enum Bank2 {
    CPB;
}

enum GirlFriend {

    XIAO_LI(18);

    private final int age;

    private GirlFriend(int age) {
        this.age = age;
    }
}