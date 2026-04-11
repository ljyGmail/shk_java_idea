package com.atguigu05.method_more._02args.exer;

public class StringConcatTest {

    public static void main(String[] args) {
        StringConcatTest test = new StringConcatTest();
        String info = test.concat("-", "hello", "world");
        System.out.println(info); // hello-world

        System.out.println(test.concat("/", "hello"));

        System.out.println(test.concat("-"));
    }

    public String concat(String separator, String... strs) {
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            if (i == 0) {
                result += strs[i];
            } else {
                result += (separator + strs[i]);
            }
        }
        return result;
    }
}
