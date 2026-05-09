package com.atguigu09.inner.exer;

public class ObjectTest {
    public static void main(String[] args) {
        // SubObject subObject = new SubObject();
        // subObject.test();

        // 提供一个继承Object的匿名子类的匿名对象
        new Object() {
            public void test() {
                System.out.println("尚硅谷");
            }
        }.test();

        // obj.test();
    }
}

class SubObject extends Object {
    public void test() {
        System.out.println("尚硅谷");
    }
}
