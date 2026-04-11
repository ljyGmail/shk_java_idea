package com.atguigu05.method_more._01overload;

/**
 * ClassName: InterviewTest
 * Package: com.atguigu05.method_more._01overload
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 11. 오후 3:14
 * @Version 1.0
 */
// 面试题
public class InterviewTest {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3};
        System.out.println(arr); // 地址值

        char[] arr1 = new char[]{'a', 'b', 'c'};
        System.out.println(arr1); // abc
        // println方法有很多重载的方法，这里调用的是参数为char[]的方法，其它的两个方法调用的是参数为Object的方法。

        boolean[] arr2 = new boolean[]{false, true, true};
        System.out.println(arr2); // 地址值

    }
}
