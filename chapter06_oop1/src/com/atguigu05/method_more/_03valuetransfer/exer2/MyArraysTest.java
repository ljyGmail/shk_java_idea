package com.atguigu05.method_more._03valuetransfer.exer2;

/**
 * ClassName: MyArraysTest
 * Package: com.atguigu04.example.exer4
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 9. 오후 11:28
 * @Version 1.0
 */
public class MyArraysTest {
    public static void main(String[] args) {

        MyArrays arrs = new MyArrays();
        int[] arr = new int[]{34, 56, 223, 2, 56, 24, 56, 67, 778, 45};

        // 求最大值
        System.out.println("最大值为:" + arrs.getMax(arr)); // 最大值为:778
        // 求平均值
        System.out.println("平均值为: " + arrs.getAvg(arr)); // 平均值为: 134
        // 遍历
        arrs.print(arr); // [34, 56, 223, 2, 56, 24, 56, 67, 778, 45]

        // 查找
        int index = arrs.linearSearch(arr, 24);
        if (index >= 0) {
            System.out.println("找到了，位置为: " + index); // 找到了，位置为: 5
        } else {
            System.out.println("未找到");
        }

        // 排序
        arrs.sort(arr, "asc");
        // 遍历
        arrs.print(arr); // [2, 24, 34, 45, 56, 56, 56, 67, 223, 778]
    }
}
