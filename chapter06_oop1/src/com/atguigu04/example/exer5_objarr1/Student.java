package com.atguigu04.example.exer5_objarr1;

/**
 * ClassName: Student
 * Package: com.atguigu04.example.exer5_objarr
 * Description:
 *
 * @Author: ljy
 * @Create: 2026. 4. 10. 오후 11:02
 * @Version 1.0
 */
public class Student {

    // 属性
    int number; // 学号
    int state; // 年级
    int score; // 成绩

    // 声明一个方法，显示学生的属性信息
    public String show() {
        return "number: " + number + ", state: " + state + ", score: " + score;
    }
}
