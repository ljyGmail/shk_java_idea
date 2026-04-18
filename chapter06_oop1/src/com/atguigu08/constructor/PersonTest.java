package com.atguigu08.constructor;

import java.util.Scanner;

/**
 * ClassName: PersonTest
 * Package: com.atguigu08.constructor
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 18. 오전 8:50
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person();

        p1.eat();

        Person p2 = new Person(9);
        System.out.println(p2.age);

        Scanner scan = new Scanner(System.in);
    }
}
