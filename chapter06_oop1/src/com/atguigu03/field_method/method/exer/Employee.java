package com.atguigu03.field_method.method.exer;

/**
 * ClassName: Employee
 * Package: com.atguigu03.field_method.field.exer1
 * Description:
 * 声明员工类Employee，包含属性: 编号id、姓名name、年龄age、薪资salary。
 * 声明EmployeeTest测试类，并在main方法中，创建2个员工对象，并为属性赋值，并打印两个员工的信息。
 *
 * @Author: ljy
 * @Create: 2026. 4. 4. 오후 7:32
 * @Version 1.0
 */
public class Employee {
    // 属性
    int id; // 编号
    String name; // 姓名
    int age; // 年龄
    double salary; // 薪资

    // 定义一个方法，用于显示员工的属性信息
    public void show() {
        System.out.println("id = " + id + ", name = " + name +
                ", age = " + age + ", salary = " + salary);
    }

    public String show1() {
        return "id = " + id + ", name = " + name +
                ", age = " + age + ", salary = " + salary;
    }
}
