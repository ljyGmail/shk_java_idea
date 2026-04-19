package com.atguigu05._super;

/**
 * ClassName: StudentTest
 * Package: com.atguigu05._super
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 19. 오후 8:07
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.eat();
        s1.sleep();

        s1.show();
        s1.show1();
        s1.show2();

        // ******************************
        System.out.println();

        Student s2 = new Student();

        System.out.println();

        Student s3 = new Student("Tom", 12);
    }
}
