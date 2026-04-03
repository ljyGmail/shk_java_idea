package com.atguigu01.oop;

/**
 * ClassName: Phone
 * Package: com.atguigu01.oop
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 3. 오후 11:31
 * @Version 1.0
 */
public class Phone {

    // 属性
    String name; // 品牌
    double price; // 价格

    // 方法
    public void call() {
        System.out.println("手机能够拨打电话");
    }

    public void sendMessage(String message) {
        System.out.println("发送信息: " + message);
    }

    public void playGame() {
        System.out.println("手机可以玩游戏");
    }
}
