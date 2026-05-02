package com.atguigu04.block.exer;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInfo());
        // 新用户注册
        // 用户名: 1777730009956, 密码: 123456, 注册时间: 1777730009956

        User u2 = new User("Tom", "654321");
        System.out.println(u2.getInfo());
        // 新用户注册
        // 用户名: Tom, 密码: 654321, 注册时间: 1777730009975

        User u3 = new User();
        System.out.println(u3.getInfo());
        // 新用户注册
        // 用户名: 1777730009976, 密码: 123456, 注册时间: 1777730009976
    }
}
