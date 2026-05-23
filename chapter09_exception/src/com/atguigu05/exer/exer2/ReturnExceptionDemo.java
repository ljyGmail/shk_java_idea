package com.atguigu05.exer.exer2;

/**
 * ClassName: ReturnExceptionDemo
 * Package: com.atguigu05.exer.exer2
 * Description:
 *
 * @Author: ljy
 * @Create: 2026. 5. 23. 오전 9:23
 * @Version 1.0
 */
public class ReturnExceptionDemo {

    static void methodA() throws Exception {
        try {
            System.out.println("进入方法A");
            throw new Exception("制造异常");
        } finally {
            System.out.println("调用A方法的finally");
        }
    }

    static void methodB() {
        try {
            System.out.println("进入方法B");
            return;
        } finally {
            System.out.println("调用B方法的finally");
        }
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        methodB();
    }
}
/*
进入方法A
调用A方法的finally
制造异常
进入方法B
调用B方法的finally
*/
