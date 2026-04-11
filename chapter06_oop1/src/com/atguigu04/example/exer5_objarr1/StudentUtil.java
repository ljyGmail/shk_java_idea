package com.atguigu04.example.exer5_objarr1;

/**
 * ClassName: StudentUtil
 * Package: com.atguigu04.example.exer5_objarr1
 * Description:
 *
 * @Author: ljy
 * @Create: 2026. 4. 11. 오전 8:44
 * @Version 1.0
 */
public class StudentUtil {

    /*
    打印指定年级的学生信息
     */
    public void printStudentsByGrade(Student[] students, int grade) {
        for (int i = 0; i < students.length; i++) {
            if (grade == students[i].state) {
                Student stu = students[i];
                System.out.println(stu.show());
            }
        }
    }

    /*
    遍历指定的学生数组
     */
    public void printStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());
        }
    }

    public void sortStudents(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
}
