package com.atguigu06.polymorphism;

/**
 * ClassName: Man
 * Package: com.atguigu06.polymorphism
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 21. 오후 9:31
 * @Version 1.0
 */
public class Man extends Person {

    boolean isSmoking;

    int id = 1002;

    public void eat() {
        System.out.println("男人多吃肉，长肌肉");
    }

    public void walk() {
        System.out.println("男人比挺地走路");
    }

    public void earnMoney() {
        System.out.println("男人挣钱养家");
    }
}
