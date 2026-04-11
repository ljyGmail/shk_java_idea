package com.atguigu04.example.exer5_objarr1;

/**
 * ClassName: StudentTest
 * Package: com.atguigu04.example.exer5_objarr
 * Description:
 *
 * @Author: ljy
 * @Create: 2026. 4. 10. 오후 11:03
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        // 创建Student[]
        Student[] students = new Student[20];

        // 使用循环，给数组的元素赋值
        for (int i = 0; i < 20; i++) {
            students[i] = new Student();
            // 给每一个学生对象的number、state、score属性赋值
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 101);
        }

        // 需求1: 打印出3年级(state值为3)的学生信息。
        StudentUtil util = new StudentUtil();
        util.printStudentsByGrade(students, 3);
        System.out.println("@@@@@@@@@@@@@@@@@@@@");

        // 排序前遍历
        util.printStudents(students);
        System.out.println("@@@@@@@@@@@@@@@@@@@@");

        // 需求2: 使用冒泡排序按学生成绩排序，并遍历所有学生信息。
        util.sortStudents(students);

        // 遍历
        util.printStudents(students);
    }
}
