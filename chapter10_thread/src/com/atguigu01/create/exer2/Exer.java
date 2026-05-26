package com.atguigu01.create.exer2;

/**
 * ClassName: Exer
 * Package: com.atguigu01.create.exer2
 * Description:
 * 思考题: 判断各自调用的是哪个run()？
 *
 * @Author: ljy
 * @Create: 2026. 5. 27. 오전 12:13
 * @Version 1.0
 */
public class Exer {
    public static void main(String[] args) {
        A a = new A();
        a.start(); // 线程A的run()...

        B b = new B(a);
        b.start(); // 线程B的run()...
    }
}

// 创建线程类A
class A extends Thread {
    @Override
    public void run() {
        System.out.println("线程A的run()...");
    }
}

// 创建线程类B
class B extends Thread {
    private A a;

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        System.out.println("线程B的run()...");
    }
}
