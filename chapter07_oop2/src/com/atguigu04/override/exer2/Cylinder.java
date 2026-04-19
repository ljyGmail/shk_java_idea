package com.atguigu04.override.exer2;

// 圆柱类
public class Cylinder extends Circle {

    private double height; // 高

    public Cylinder() {
        height = 1;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 求圆柱的体积
    double findVolume() {
        // 错误的:
        // return findArea() * height;
        return Math.PI * getRadius() * getRadius() * height;
    }

    // 求表面积
    public double findArea() {
        return Math.PI * getRadius() * getRadius() * 2
                + getHeight() * getRadius() * Math.PI * 2;
    }
}
