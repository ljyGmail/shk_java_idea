package com.atguigu1.one;

/**
 * ClassName: OneArrayTest1
 * Package: com.atguigu1.one
 * Description: 一维数组的基本使用(承接OneArrayTest.java)
 *
 * @Author ljy
 * @Create 2026. 3. 23. 오후 11:44
 * @Version 1.0
 */
public class OneArrayTest1 {
    public static void main(String[] args) {
        // 5. 数组元素的默认初始化值
        // > 整型数组元素的默认初始化值: 0
        int[] arr1 = new int[3];
        System.out.println(arr1[0]);

        short[] arr2 = new short[4];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        // > 浮点型数组元素的默认初始化值:
        double[] arr3 = new double[5];
        System.out.println(arr3[0]);

        // > 字符型数组元素的默认初始化值: 0(或理解为: '\u0000')
        char[] arr4 = new char[4];
        System.out.println(arr4[0]);

        if (arr4[0] == 0) {
            System.out.println("111"); // 输出
        }

        if (arr4[0] == '0') {
            System.out.println("222");
        }

        if (arr4[0] == '\u0000') {
            System.out.println("333");
        }

        System.out.println(arr4[0] + 1);

        // > boolean型数组元素的默认初始化值: false
        boolean[] arr5 = new boolean[4];
        System.out.println(arr5[0]);

        // > 引用数据类型数组元素的默认初始化值: null
        String[] arr6 = new String[5];
        for (int i = 0; i < arr6.length; i++) {
            System.out.println(arr6[i]);
        }

        if (arr6[0] == null) {
            System.out.println("aaa");
        }

        if (arr6[0] == "null") {
            System.out.println("bbb");
        }

        // 6. 数组的内存解析
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = a1;
        a2[1] = 10;
        System.out.println(a1[1]); // 10
        System.out.println(a1); // [I@3fee733d
        System.out.println(a2); // [I@3fee733d
    }
}
