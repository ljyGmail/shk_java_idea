package com.atguigu04.example.exer3;

/**
 * ClassName: Circle
 * Package: com.atguigu04.example.exer3
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 9. 오후 11:18
 * @Version 1.0
 */
public class Circle {
    // 属性
    double radius; // 半径

    // 方法
    public void findArea() {
        System.out.println("面积为: " + 3.14 * radius * radius);
    }

    // 或:
    public double findArea2() {
        return 3.14 * radius * radius;
    }

    // 错误的:
    // public void findArea1(double r) {
    //     System.out.println("面积为: " + 3.14 * r * r);
    // }
}
