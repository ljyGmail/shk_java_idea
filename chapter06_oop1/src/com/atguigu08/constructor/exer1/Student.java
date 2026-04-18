package com.atguigu08.constructor.exer1;

/**
 * ClassName: Student
 * Package: com.atguigu08.constructor.exer1
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 18. 오전 9:35
 * @Version 1.0
 */
public class Student {

    String name;
    int age;
    String school;
    String major; // 专业

    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public Student(String n, int a, String s) {
        name = n;
        age = a;
        school = s;
    }

    public Student(String n, int a, String s, String m) {
        name = n;
        age = a;
        school = s;
        major = m;
    }

    public String getInfo() {
        return "name = " + name + ", age = " + age
                + ", school = " + school + ", major = " + major;
    }
}
