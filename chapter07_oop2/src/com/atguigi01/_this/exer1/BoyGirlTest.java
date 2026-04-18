package com.atguigi01._this.exer1;

/**
 * ClassName: BoyGirlTest
 * Package: com.atguigi01._this.exer1
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 18. 오후 8:36
 * @Version 1.0
 */
public class BoyGirlTest {
    public static void main(String[] args) {

        Boy boy1 = new Boy("杰克", 24);

        Girl girl1 = new Girl("朱丽叶", 20);

        girl1.marry(boy1);

        boy1.shout();

        Girl girl2 = new Girl("肉丝", 18);

        int compare = girl1.compare(girl2);
        if (compare > 0) {
            System.out.println(girl1.getName() + "大");
        } else if (compare < 0) {
            System.out.println(girl2.getName() + "大");
        } else {
            System.out.println("一样大");
        }
    }
}
