package com.atguigu03.thread_safe.runnable_safe;

/**
 * ClassName: WindowTest
 * Package: com.atguigu03.threadsafe.notsafe
 * Description:
 * 使用实现Runnable接口的方式，实现卖票。 --> 存在线程安全问题。
 * 使用同步代码块解决上述卖票中的线程安全问题。
 *
 * @Author: ljy
 * @Create: 2026. 5. 30. 오후 6:57
 * @Version 1.0
 */

class SaleTicker implements Runnable {
    private int ticketNum = 100;

    Object obj = new Object();
    Dog dog = new Dog();

    @Override
    public void run() {
        // synchronized (this) { // this: 是唯一的？ yes，就是题目中的saleTicker
        while (true) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // synchronized (obj) { // obj: 是唯一的？ yes
            // synchronized (dog) { // dog: 是唯一的？ yes
            synchronized (this) { // this: 是唯一的？ yes，就是题目中的saleTicker
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

class Dog {

}