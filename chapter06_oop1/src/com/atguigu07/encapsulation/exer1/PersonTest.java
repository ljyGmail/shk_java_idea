package com.atguigu07.encapsulation.exer1;

/**
 * ClassName: PersonTest
 * Package: com.atguigu07.encapsulation.exer1
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 17. 오후 10:28
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {

        // 创建Person实例1
        Person p1 = new Person();
        // p1.age = 10; // 编译不通过

        p1.setAge(20);
        System.out.println(p1.getAge());
    }
}
