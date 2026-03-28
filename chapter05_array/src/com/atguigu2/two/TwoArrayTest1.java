package com.atguigu2.two;

/**
 * ClassName: TwoArrayTest1
 * Package: com.atguigu2.two
 * Description:
 * 二维数组的基本使用(难点) (承接TwoArrayTest.java)
 *
 * @Author ljy
 * @Create 2026. 3. 28. 오후 9:53
 * @Version 1.0
 */
public class TwoArrayTest1 {
    public static void main(String[] args) {

        // 5. 数组元素的默认初始化值
        // 以动态初始化方式1说明:
        int[][] arr1 = new int[3][2];
        // 外层元素默认值:
        System.out.println(arr1[0]); // 地址值 [I@3fee733d
        System.out.println(arr1[1]); // 地址值 [I@5acf9800
        // 内层元素默认值:
        System.out.println(arr1[0][0]); // 0

        boolean[][] arr2 = new boolean[3][4];
        // 外层元素默认值:
        System.out.println(arr2[0]); // 地址值 [Z@4617c264
        // 内层元素默认值:
        System.out.println(arr2[0][1]); // false

        String[][] arr3 = new String[4][2];
        // 外层元素默认值:
        System.out.println(arr3[0]); // 地址值 [Ljava.lang.String;@36baf30c
        // 内层元素默认值:
        System.out.println(arr3[0][1]); // null

        // ******************************
        // 以动态初始化方式2说明:
        int[][] arr4 = new int[4][];
        // 外层元素默认值:
        System.out.println(arr4[0]); // null
        // 内层元素默认值:
        // System.out.println(arr4[0][0]); // 报错: 空指针异常

        String[][] arr5=new String[5][];
        // 外层元素默认值:
        System.out.println(arr5[0]); // null
        // 内层元素默认值:
        // System.out.println(arr5[0][0]); // 报错: 空指针异常

        // 6. 数组的内存解析
    }
}
