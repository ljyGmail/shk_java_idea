package com.atguigu07.encapsulation.exer2;

/**
 * ClassName: BookTest
 * Package: com.atguigu07.encapsulation.exer2
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 17. 오후 10:39
 * @Version 1.0
 */
public class BookTest {
    public static void main(String[] args) {

        Book book1 = new Book();

        book1.setBookName("剑指Java");
        book1.setAuthor("尚硅谷教育");
        book1.setPrice(180.0);

        System.out.println(book1.showInfo());
    }
}
