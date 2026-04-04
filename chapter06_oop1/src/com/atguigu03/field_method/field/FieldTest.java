package com.atguigu03.field_method.field;

/**
 * ClassName: FieldTest
 * Package: com.atguigu03.field_method.field
 * Description:
 *
 * @Author: ljy
 * @Create: 2026. 4. 4. 오후 6:10
 * @Version 1.0
 */
public class FieldTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name + ", " + p1.age);
    }
}

class Person {
    // 属性（或成员变量）
    String name;
    int age;
    char gender;

    // 方法
    public void eat() {
        String food = "宫保鸡丁"; // 局部变量
        System.out.println("我喜欢吃" + food);
    }

    public void sleep(int hour) { // 形参，属于局部变量
        System.out.println("人不能少于" + hour + "小时的睡眠");

        // 编译不通过，因为超出了food变量的作用域。
        // System.out.println("我喜欢吃" + food);

        // 编译通过
        System.out.println("name = " + name);
    }
}