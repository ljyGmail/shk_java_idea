package com.atguigu08.constructor.exer1;

/**
 * ClassName: StudentTest
 * Package: com.atguigu08.constructor.exer1
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 18. 오전 9:37
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student("康师傅", 42, "石家庄科技大学", "软件工程");
        System.out.println(s1.getInfo());

        Student s2 = new Student("张天禹", 34, "北京大学");
        System.out.println(s2.getInfo());
    }
}
