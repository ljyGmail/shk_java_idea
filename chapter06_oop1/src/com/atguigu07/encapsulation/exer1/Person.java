package com.atguigu07.encapsulation.exer1;

/**
 * ClassName: Person
 * Package: com.atguigu07.encapsulation.exer1
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 17. 오후 10:26
 * @Version 1.0
 */
public class Person {

    private int age;

    // 设置age属性
    public void setAge(int a) {
        if (a >= 0 && a <= 30) {
            age = a;
        } else {
            System.out.println("你输入的数据非法");
        }
    }

    // 获取age属性
    public int getAge() {
        return age;
    }

    // 错误的
    /*
    public int doAge(int a) {
        if (a >= 0 && a <= 130) {
            age = a;
            return age;
        } else {
            System.out.println("你输入的数据非法");
            return -1;
        }
    }
     */
}
