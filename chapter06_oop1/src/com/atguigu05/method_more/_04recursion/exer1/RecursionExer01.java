package com.atguigu05.method_more._04recursion.exer1;

/**
 * ClassName: RecursionExer01
 * Package: com.atguigu05.method_more._04recursion.exer1
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 12. 오후 9:33
 * @Version 1.0
 */
public class RecursionExer01 {

    /*
    练习1:
    已知一个数列: f(20) = 1, f(21) = 4, f(n+2) = 2 * f(n+1) + f(n)。
    其中n是大于0的整数，求f(10)的值。
     */
    public int f(int n) {
        if (n == 20) {
            return 1;
        } else if (n == 21) {
            return 4;
        } else {
            return f(n + 2) - 2 * f(n + 1);
            // 错误的:
            // return 2 * f(n - 1) + f(n - 2);
        }
    }

    /*
    练习2:
    已知有一个数列: f(0) = 1,f(1) = 4,
    f(n+2) = 2 * f(n+1) + f(n)，其中n是大于0的整数，求f(10)的值。
     */
    public int f1(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            // 错误的:
            // return f(n + 2) - 2 * f(n + 1);
            return 2 * f(n - 1) + f(n - 2); // 需要向已知的方向递归
        }
    }
}
