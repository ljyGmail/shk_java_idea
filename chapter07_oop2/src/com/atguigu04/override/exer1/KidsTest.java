package com.atguigu04.override.exer1;

public class KidsTest {
    public static void main(String[] args) {

        Kids kid = new Kids();

        kid.setSex(1);
        kid.setSalary(100);
        kid.setYearsOld(12);

        // 来自于父类中声明的方法
        kid.employeed(); // Kids should study and no job.
        kid.manOrWoman(); // Man

        // Kids类自己声明的方法
        kid.printAge(); // I am 12 years old.
    }
}
