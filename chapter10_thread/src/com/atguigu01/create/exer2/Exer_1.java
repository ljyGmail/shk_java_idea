package com.atguigu01.create.exer2;

/**
 * ClassName: Exer_1
 * Package: com.atguigu01.create.exer2
 * Description:
 *
 * @Author: ljy
 * @Create: 2026. 5. 27. 오전 12:19
 * @Version 1.0
 */
public class Exer_1 {
    public static void main(String[] args) {
        BB b = new BB();
        new Thread(b) {
            @Override
            public void run() {
                System.out.println("CC");
            }
        }.start(); // CC

        new Thread() {
        }.start(); // 无输出
    }
}

class AA extends Thread {
    @Override
    public void run() {
        System.out.println("线程AA的run()...");
    }
}

class BB implements Runnable {
    @Override
    public void run() {
        System.out.println("线程BB的run()...");
    }
}
