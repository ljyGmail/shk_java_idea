package com.atguigu04.example.exer2;

/**
 * ClassName: Exer02
 * Package: com.atguigu04.example.exer2
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 9. 오후 11:07
 * @Version 1.0
 */
public class Exer02 {
    public void method1() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int method2() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 10 * 8;
    }

    public int method3(int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return m * n;
    }
}
