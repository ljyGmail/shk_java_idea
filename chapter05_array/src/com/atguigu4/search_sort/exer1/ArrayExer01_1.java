package com.atguigu4.search_sort.exer1;

/**
 * ClassName: ArrayExer01_1
 * Package: com.atguigu4.search_sort.exer1
 * Description:
 *
 * @Author ljy
 * @Create 2026. 3. 29. 오후 1:46
 * @Version 1.0
 */
public class ArrayExer01_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        // 扩容1倍容量
        // int[] newArr = new int[arr.length * 2];
        int[] newArr = new int[arr.length << 1];

        // 将原有数组中元素复制到新的数组中
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // 将10, 20, 30三个数据添加到新数组中
        newArr[arr.length] = 10;
        newArr[arr.length + 1] = 20;
        newArr[arr.length + 2] = 30;

        // 将新的数组的地址赋值给原有的数组变量
        arr = newArr;

        // 遍历arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
