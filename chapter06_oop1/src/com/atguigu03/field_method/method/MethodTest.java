package com.atguigu03.field_method.method;

/**
 * ClassName: MethodTest
 * Package: com.atguigu03.field_method.method
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 5. 오후 8:52
 * @Version 1.0
 */
public class MethodTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        p1.info();
    }
}


class Person {
    // 属性
    String name;
    int age;
    char gender;

    // 方法
    public void eat() {
        System.out.println("人吃饭");

        sleep(8);

        System.out.println("name = " + name);
    }

    public void sleep(int hour) {
        System.out.println("人至少每天睡眠" + hour + "小时");
    }

    public String interests(String hobby) {
        String info = "我的爱好" + hobby;
        System.out.println("我的爱好是" + hobby);
        // return info;
        return "abc";
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("Person info()");
        // info();

        // 方法内不能定义方法
        /*
        public void show() {

        }
         */
    }

    public void printNumber(int targetNumber) { // 10
        for (int i = 0; i < targetNumber; i++) {
            if (i == 4) {
                return; // 用于结束方法

                // return后面不能声明执行语句。
                // System.out.println("xxx");
            }
            System.out.println(i);
        }
    }
}