package com.atguigu03._extends.exer2;

public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.3);
        cylinder.setHeight(1.4);

        System.out.println("圆柱的体积为: " + cylinder.findVolume());

        System.out.println("圆柱的底面积为: " + cylinder.findArea());
    }
}
