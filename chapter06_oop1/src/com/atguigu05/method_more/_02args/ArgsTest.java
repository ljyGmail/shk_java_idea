package com.atguigu05.method_more._02args;

public class ArgsTest {

    public static void main(String[] args) {
        ArgsTest test = new ArgsTest();

        test.print(); // 1111
        test.print(1); // 2222
        test.print(1, 2); // 3333

        test.print(new int[]{1, 2, 3});
        // test.print(1, 2, 3);
    }

    public void print(int... nums) {
        System.out.println("1111");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    // public void print(int[] nums) {

    // }

    public void print(int i, int... nums) {

    }

    // 编译不通过
    // public void print(int... nums, int i) {

    // }

    public void print(int i) {
        System.out.println("2222");
    }

    public void print(int i, int j) {
        System.out.println("3333");
    }

    /*
    场景举例:
    String sql = "update customer set name = ?, email = ? where id = ?";

    String sql1 = "update customers set name = ? where id = ?";

    public void update(String sql, Object... objs);
     */
}
