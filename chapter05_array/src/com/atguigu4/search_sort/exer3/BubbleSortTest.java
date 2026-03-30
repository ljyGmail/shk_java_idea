package com.atguigu4.search_sort.exer3;

/**
 * ClassName: BubbleSortTest
 * Package: com.atguigu4.search_sort.exer3
 * Description:
 *
 * @Author ljy
 * @Create 2026. 3. 29. 오후 8:54
 * @Version 1.0
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};

        // 遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        // 冒泡排序，实现数组元素从小到大的排序。
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - j; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换arr[i] 和 arr[i+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
