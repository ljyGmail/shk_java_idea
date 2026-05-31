package com.atguigu03.thread_safe.thread_safe;

/**
 * ClassName: WindowTest1
 * Package: com.atguigu03.threadsafe.notsafe
 * Description:
 * 使用继承Thread类的方式，实现卖票。
 * 使用同步代码块的方式解决线程安全问题。
 *
 * @Author: ljy
 * @Create: 2026. 5. 31. 오전 8:12
 * @Version 1.0
 */
class Window extends Thread {
    static int ticketNum = 100;

    static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            // synchronized (this) { // this: 此时表示w1，w2，w3。不能保证锁的唯一性。
            // synchronized (obj) { // obj: 使用static修饰以后，就能保证其唯一性。
            synchronized (Window.class) { // 结构: Class clazz = Window.class;是唯一的。
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
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
