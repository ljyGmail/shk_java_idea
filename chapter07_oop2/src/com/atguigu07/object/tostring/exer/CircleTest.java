package com.atguigu07.object.tostring.exer;

public class CircleTest {
    public static void main(String[] args) {

        Circle c1 = new Circle(2.3); // false
        Circle c2 = new Circle("red", 2.0, 3.4); // false

        System.out.println("颜色是否相等? " + c1.getColor().equals(c2.getColor()));
        System.out.println("半径是否相等: " + c1.equals(c2));
        System.out.println(c1); // Circle[radius = 2.3]
        System.out.println(c1.toString()); // Circle[radius = 2.3]
    }
}
