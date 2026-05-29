package com.atguigu02.method_lifecycle;

/**
 * ClassName: EvenNumberTest
 * Package: com.atguigu02.method_lifecycle
 * Description:
 *
 * @Author: ljy
 * @Create: 2026. 5. 29. 오전 6:14
 * @Version 1.0
 */
class PrintNumber extends Thread {

    public PrintNumber() {
    }

    public PrintNumber(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            // try {
            //     Thread.sleep(1000);
            // } catch (InterruptedException e) {
            //     throw new RuntimeException(e);
            // }
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ", 优先级: " + Thread.currentThread().getPriority() + ": " + i);
            }

            // if (i % 20 == 0) {
            //     Thread.yield();
            // }
        }
    }
}

public class EvenNumberTest {
    public static void main(String[] args) {
        PrintNumber t1 = new PrintNumber("线程1");

        // 设置线程名
        t1.setName("子线程1");
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();

        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ", 优先级: "
                        + Thread.currentThread().getPriority() + ": " + i);
            }

            // if (i % 20 == 0) {
            //     try {
            //         t1.join();
            //     } catch (InterruptedException e) {
            //         throw new RuntimeException(e);
            //     }
            // }
        }

        // System.out.println("子线程1是否存活？ " + t1.isAlive()); // false
    }
}

