package com.atguigu4.search_sort.exer2;

/**
 * ClassName: LinearSearchTest
 * Package: com.atguigu4.search_sort.exer2
 * Description:
 *
 * @Author ljy
 * @Create 2026. 3. 29. 오후 2:28
 * @Version 1.0
 */
public class LinearSearchTest {
    public static void main(String[] args) {
        int[] arr1 = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};

        int target = 5;
        target = 15;

        // 查找方式: 线性查找
        // 方式1:
        /*
        boolean isFlag = true;
        for (int i = 0; i < arr1.length; i++) {
            if (target == arr1[i]) {
                System.out.println("找到了" + target + "，对应的位置为: " + i);
                isFlag = false;
                break;
            }
        }

        if (isFlag) {
            System.out.println("不好意思，没有找到此元素。");
        }
         */
        // 方式2:
        int i = 0;
        for (; i < arr1.length; i++) {
            if (target == arr1[i]) {
                System.out.println("找到了" + target + "，对应的位置为: " + i);
                break;
            }
        }

        // 如果i的值达到了arr1.length，则说明上面的循环不是因为break结束的，而是循环到了循环条件不成立才结束的。
        if (i == arr1.length) {
            System.out.println("不好意思，没有找到此元素。");
        }
    }
}
