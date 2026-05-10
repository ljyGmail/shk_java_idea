package com.atguigu11.annotation.junit;

import org.junit.Test;

import java.util.Scanner;

public class JUnitTest { // 单元测试类

    public static void main(String[] args) {
        JUnitTest test = new JUnitTest();
        System.out.println(test.number);
        test.method();
    }

    int number = 10;

    // public JUnitTest() {
    // }

    // public JUnitTest(int id) {
    // }

    @Test
    public void test1() { //  单元测试方法
        System.out.println("Hello");
    }

    @Test
    public void test2() {
        System.out.println("hello1");
        System.out.println("number = " + number);

        method();

        int num = showInfo("China");
        System.out.println(num);
    }

    public void method() {
        System.out.println("method()...");
    }

    public int showInfo(String info) {
        System.out.println(info);
        return 10;
    }
    
    @Test
    public void test3() {
        Scanner scan=new Scanner(System.in);

        System.out.println("请输入一个数值: ");
        String num = scan.next();
        System.out.println(num);
    }
}
