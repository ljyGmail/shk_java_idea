package com.atguigu03._extends.exer2;

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
        // return Math.PI * getRadius() * getRadius() * height;
        return findArea() * height;
    }
}
