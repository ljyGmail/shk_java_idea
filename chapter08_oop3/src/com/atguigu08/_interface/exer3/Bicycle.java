package com.atguigu08._interface.exer3;

public class Bicycle extends Vehicle {

    public Bicycle() {
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    void run() {
        System.out.println("自行车通过人力脚蹬行驶");
    }
}
