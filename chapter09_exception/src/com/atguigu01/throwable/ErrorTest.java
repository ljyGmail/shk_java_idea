package com.atguigu01.throwable;

public class ErrorTest {
    public static void main(String[] args) {

        // 举例1: 栈内存溢出的错误 StackOverflowError
        // main(args);

        // 举例2: OutOfMemoryError: Java heap space
        byte[] arr = new byte[1024 * 1024 * 100]; // 100MB

        // 要让上面的代码发生错误，打开当前类的运行选项: Edit Configurations...
        // 点击Modify options -> Add VM options -> 填写: -Xms10m -Xmx10m
    }
}
