package com.atguigu07.encapsulation.exer2;

/**
 * ClassName: Book
 * Package: com.atguigu07.encapsulation.exer2
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 17. 오후 10:35
 * @Version 1.0
 */
public class Book {
    private String bookName; // 书名
    private String author; // 作者
    private double price; // 价格

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bn) {
        bookName = bn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setPrice(double p) {
        price = p;
    }

    public double getPrice() {
        return price;
    }

    // 获取图书信息
    public String showInfo() {
        return "bookName: " + bookName + ", author" + author + ", price" + price;
    }
}
