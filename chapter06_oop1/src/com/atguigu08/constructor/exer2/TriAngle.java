package com.atguigu08.constructor.exer2;

/**
 * ClassName: TriAngle
 * Package: com.atguigu08.constructor.exer2
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 18. 오전 9:48
 * @Version 1.0
 */
public class TriAngle {
    // 属性
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double b) {
        base = b;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public TriAngle() {
    }

    public TriAngle(double b, double h) {
        base = b;
        height = h;
    }

    // 求面积的方法
    public double findArea() {
        return base * height / 2;
    }
}
