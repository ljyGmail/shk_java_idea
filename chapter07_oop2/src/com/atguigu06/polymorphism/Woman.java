package com.atguigu06.polymorphism;

/**
 * ClassName: Woman
 * Package: com.atguigu06.polymorphism
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 21. 오후 9:34
 * @Version 1.0
 */
public class Woman extends Person {

    boolean isBeauty;

    public void eat() {
        System.out.println("女人应该少吃，减肥");
    }

    public void walk() {
        System.out.println("女人窈窕地走路");
    }

    public void goShopping() {
        System.out.println("女人喜欢逛街");
    }
}
