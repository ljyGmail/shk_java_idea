package com.atguigu04.example.exer3;

/**
 * ClassName: CircleTest
 * Package: com.atguigu04.example.exer3
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 9. 오후 11:20
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 2.3;
        c1.findArea();

        // c1.findArea1(3.2);

        System.out.println("面积为: " + c1.findArea2());
    }
}
