package com.atguigu05.method_more._03valuetransfer;

/**
 * ClassName: ValueTransferTest3
 * Package: com.atguigu05.method_more._03valuetransfer
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 12. 오전 12:21
 * @Version 1.0
 */
public class ValueTransferTest3 {
    public static void main(String[] args) {
        ValueTransferTest3 test = new ValueTransferTest3();

        Data data = new Data();
        data.m = 10;
        data.n = 20;

        System.out.println("m = " + data.m + ", n = " + data.n); // m = 10, n = 20

        // 操作1:
        // int temp = data.m;
        // data.m = data.n;
        // data.n = temp;

        // 操作2: 调用方法
        test.swap(data);


        System.out.println("m = " + data.m + ", n = " + data.n); // m = 20, n - 10
    }

    public void swap(Data data) {
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }

}

class Data {
    int m;
    int n;
}