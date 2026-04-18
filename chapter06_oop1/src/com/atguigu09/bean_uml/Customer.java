package com.atguigu09.bean_uml;

/**
 * ClassName: Customer
 * Package: com.atguigu09.bean_uml
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 18. 오후 1:55
 * @Version 1.0
 */
public class Customer {

    private int id;
    private String name;

    public Customer() {
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
