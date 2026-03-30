package com.atguigu3.common_algorithm.exer5;

/**
 * ClassName: ArrayExer05
 * Package: com.atguigu3.common_algorithm.exer5
 * Description:
 *
 * @Author ljy
 * @Create 2026. 3. 29. 오후 1:17
 * @Version 1.0
 */
public class ArrayExer05 {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};

        // 遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        // 反转操作
        // 方式1: 交换元素的位置
        /*
        for (int i = 0; i < arr.length / 2; i++) {
            // 交换arr[i] 与 arr[arr.length - 1 - i]位置的元素
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
         */
        // 方式2: 同样是交换元素的位置，不同的是声明两个参与遍历的变量。
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            // 交换arr[i] 与 arr[j]位置的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // 方式3: 创建一个新的数组，不推荐。
        /*
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[arr.length - 1 - i] = arr[i];
        }
        arr = newArr;
         */

        // 遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
