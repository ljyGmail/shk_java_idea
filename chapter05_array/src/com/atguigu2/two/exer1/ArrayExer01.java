package com.atguigu2.two.exer1;

/**
 * ClassName: ArrayExer01
 * Package: com.atguigu2.two.exer1
 * Description:
 *
 * @Author ljy
 * @Create 2026. 3. 28. 오후 10:22
 * @Version 1.0
 */
public class ArrayExer01 {
    public static void main(String[] args) {
        // 初始化数组: 静态初始化
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};

        /* 这种情况下，动态初始化没有静态初始化方便:
        int[][] arr = new int[3][];
        arr[0] = new int[]{3, 5, 8};
        arr[1] = new int[]{12, 9};
        arr[2] = new int[]{7, 0, 6, 4};
         */

        int sum = 0; // 记录元素的总和

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println("总和为: " + sum);
    }
}
