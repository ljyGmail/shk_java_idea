package com.atguigu02.trycatchfinally.interview;

public class FinallyTest4 {
    public static void main(String[] args) {
        int result = test(10);
        System.out.println(result);
    }

    public static int test(int num) {
        try {
            return num;
        } catch (NumberFormatException e) {
            return num--;
        } finally {
            System.out.println("test结束");
            // return ++num; // 11
            ++num; // 10
        }
    }
}
