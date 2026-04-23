package com.atguigu06.polymorphism;

public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Man();

        // 不能直接调用子类特有的结构
        // System.out.println(p1.isSmoking);
        // p1.earnMonry();

        // 向下转型: 使用强转符。
        Man m1 = (Man) p1;
        m1.earnMoney(); // 男人挣钱养家
        System.out.println(m1.isSmoking); // false

        System.out.println(p1 == m1); // true，p1和m1指向对空间中的同一个对象

        /*
        向下转型可能会出现: 类型转换异常(ClassCastException)
         */
        Person p2 = new Woman();
        // Man m2 = (Man) p2;
        // m2.earnMoney();

        /*
        1. 建议在向下转型之前，使用instanceof进行判断，避免出现类型转换异常。
        2. 格式: a instanceof A: 判断对象a是否是类A或其子类的实例。
        3. 如果a instanceof A返回true，则:
                a instanceof superA返回也是true。其中A是superA的子类。
         */
        if (p2 instanceof Man) {
            Man m2 = (Man) p2;
            m2.earnMoney();
        }

        if (p2 instanceof Woman) {
            System.out.println("Woman"); // 输出
        }

        if (p2 instanceof Person) {
            System.out.println("Person"); // 输出
        }

        if (p2 instanceof Object) {
            System.out.println("Object"); // 输出
        }
    }
}
