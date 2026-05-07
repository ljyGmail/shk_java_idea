package com.atguigu08._interface.exer3;

public class VehicleTest {
    public static void main(String[] args) {

        Developer developer = new Developer();

        // 创建三个交通工具，保存在数组中。
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("捷安特", "骚红色");
        vehicles[1] = new ElectricVehicle("雅迪", "天蓝色");
        vehicles[2] = new Car("奔驰", "黑色", "沪Au888");

        for (int i = 0; i < vehicles.length; i++) {
            developer.takingVehicle(vehicles[i]);

            if (vehicles[i] instanceof IPower) {
                ((IPower) vehicles[i]).power();
            }
        }
    }
    /*
    自行车通过人力脚蹬行驶
    电动车通过电机驱动行驶
    电动车使用电力提供动力
    汽车通过内燃机行驶
    汽车通过汽油提供动力
     */
}
