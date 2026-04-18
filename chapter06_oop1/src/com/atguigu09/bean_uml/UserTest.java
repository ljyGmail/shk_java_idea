package com.atguigu09.bean_uml;

/**
 * ClassName: UserTest
 * Package: com.atguigu09.bean_uml
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 18. 오후 1:36
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {

        User u1 = new User();

        System.out.println(u1.age);

        User u2 = new User(10);
        System.out.println(u2.age);
        u2.age = 3;
        u2.age = 4;
    }
}

class User {
    // 属性(或实例变量)
    String name;
    int age = 9;

    public User() {
    }

    public User(int a) {
        age = a;
    }
}
