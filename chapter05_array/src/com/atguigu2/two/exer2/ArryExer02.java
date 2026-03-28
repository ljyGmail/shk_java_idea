package com.atguigu2.two.exer2;

/**
 * ClassName: ArryExer02
 * Package: com.atguigu2.two.exer2
 * Description:
 *
 * @Author ljy
 * @Create 2026. 3. 28. 오후 10:29
 * @Version 1.0
 */
public class ArryExer02 {
    public static void main(String[] args) {
        // =: 赋值符号。
        int i = 10;
        int j = i;
        byte b = (byte) i;// 强制类型转换

        long l = i; // 自动类型提升


        // 举例: 数组
        int[] arr1 = new int[10];
        byte[] arr2 = new byte[10];
        // arr1 = arr2; // 编译不通过。原因: int[]和byte[]是两种不同类型的引用变量。

        System.out.println(arr1); // [I@3fee733d
        System.out.println(arr2); // [B@5acf9800

        int[][] arr3 = new int[3][2];
        // arr3 = arr1; // 编译不通过。

        arr3[0] = arr1;
        System.out.println(arr3[0]); // [I@3fee733d
        System.out.println(arr1); // [I@3fee733d

        System.out.println(arr3); // [[I@4617c264
    }
}
