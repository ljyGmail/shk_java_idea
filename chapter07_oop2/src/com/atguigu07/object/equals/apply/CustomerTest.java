package com.atguigu07.object.equals.apply;

/**
 * ClassName: CustomerTest
 * Package: com.atguigu07.object.equals.apply
 * Description:
 * 说明: 判断两个Customer对象是否equals()，除了Customer类需要重写equals()之外，其内部的类类型的属性
 * 所在的类，也需要重写equals()。
 *
 * @Author ljy
 * @Create 2026. 4. 26. 오전 12:59
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tom", 12, new Account(2000));
        Customer c2 = new Customer("Tom", 12, new Account(2000));

        System.out.println(c1.equals(c2)); // false --> true
    }
}
