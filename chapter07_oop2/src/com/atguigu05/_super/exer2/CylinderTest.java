package com.atguigu05._super.exer2;

public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.3);
        cylinder.setHeight(1.4);

        System.out.println("圆柱的体积为: " + cylinder.findVolume());

        System.out.println("圆柱的表面积为: " + cylinder.findArea());
        // 圆柱的体积为: 23.266635192486003
        // 圆柱的表面积为: 53.46990696409827
    }
}
