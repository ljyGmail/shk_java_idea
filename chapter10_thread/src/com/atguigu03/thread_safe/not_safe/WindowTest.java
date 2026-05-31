package com.atguigu03.thread_safe.not_safe;

/**
 * ClassName: WindowTest
 * Package: com.atguigu03.threadsafe.notsafe
 * Description:
 * 使用实现Runnable接口的方式，实现卖票。
 *
 * @Author: ljy
 * @Create: 2026. 5. 30. 오후 6:57
 * @Version 1.0
 */

class SaleTicker implements Runnable {
    private int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " is selling ticket " + ticketNum);
                ticketNum--;
            } else {
                break;
            }
        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        SaleTicker saleTicker = new SaleTicker();
        Thread thread1 = new Thread(saleTicker, "Window 1");
        Thread thread2 = new Thread(saleTicker, "Window 2");
        Thread thread3 = new Thread(saleTicker, "Window 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
