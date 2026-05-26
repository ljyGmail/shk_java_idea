package com.atguigu01.create.runnable;

/**
 * ClassName: EvenNumberTest
 * Package: com.atguigu01.create.runnable
 * Description:
 *
 * @Author: ljy
 * @Create: 2026. 5. 26. 오후 11:45
 * @Version 1.0
 */
// 1) 创建一个实现Runnable接口的类。
class EvenNumberPrint implements Runnable {
    // 2) 实现接口中的run() --> 将此线程要执行的操作，声明在此方法中。
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

public class EvenNumberTest {
    public static void main(String[] args) {
        // 3) 创建当前实现类的对象。
        EvenNumberPrint p = new EvenNumberPrint();
        // 4) 将此对象作为参数传递到Thread类的构造器中，创建Thread类的实例。
        Thread t1 = new Thread(p);
        // 5) Thread类的实例调用start(): 1. 启动线程 2. 调用当前线程的run()
        t1.start();

        // main()方法对应的主线程执行的操作
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }

        /*
        拓展: 再创建一个线程，用于遍历100以内的偶数。
         */
        Thread t2 = new Thread(p);
        t2.start();
    }
}
