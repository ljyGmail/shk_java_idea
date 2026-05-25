package com.atguigu01.create;

/**
 * ClassName: SingleThread
 * Package: com.atguigu01.create
 * Description:
 *
 * @Author: ljy
 * @Create: 2026. 5. 25. 오후 7:26
 * @Version 1.0
 */
// 单线程
public class SingleThread {

    public void method1(String str) {
        System.out.println(str);
    }

    public void method2(String str) {
        method1(str);
    }

    public static void main(String[] args) {
        SingleThread s = new SingleThread();
        s.method2("hello!");
    }
}
