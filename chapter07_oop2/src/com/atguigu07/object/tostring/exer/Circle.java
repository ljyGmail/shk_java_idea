package com.atguigu07.object.tostring.exer;

public class Circle extends GeometricObject {

    private double radius;

    public Circle() {
        // 由于在父类构造器中已经进行了初始化，此处没有必要赋值
        // color = "white";
        // weight = 1.0;
        radius = 1.0;
    }

    public Circle(double radius) {
        // 由于在父类构造器中已经进行了初始化，此处没有必要赋值
        // color = "white";
        // weight = 1.0;
        this.radius = radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // 求圆的面积
    public double findArea() {
        return Math.PI * radius * radius;
    }

    // 重写equals()

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Circle) {
            Circle c = (Circle) obj;
            return this.radius == c.radius;
        }
        return false;
    }

    // 重写toString()
    @Override
    public String toString() {
        return "Circle[radius = " + radius + "]";
    }
}
