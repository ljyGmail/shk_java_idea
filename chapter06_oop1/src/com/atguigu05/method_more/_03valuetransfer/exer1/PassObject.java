package com.atguigu05.method_more._03valuetransfer.exer1;

/**
 * ClassName: PassObject
 * Package: com.atguigu05.method_more._03valuetransfer.exer1
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 12. 오전 12:39
 * @Version 1.0
 */
public class PassObject {

    public static void main(String[] args) {
        PassObject obj = new PassObject();
        Circle circle = new Circle();
        obj.printAreas(circle, 5);

        System.out.println("now radius is " + circle.radius);
    }

    public void printAreas(Circle c, int time) {
        System.out.println("Radius\t\tArea");

        int i = 1;
        for (; i < time; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t\t" + c.findArea());
        }

        c.radius = i;
    }
}
