package com.atguigi01._this.exer2;

/**
 * ClassName: Customer
 * Package: com.atguigi01._this.exer2
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 18. 오후 8:56
 * @Version 1.0
 */
public class Customer {
    private String firstName; // 名
    private String lastName; // 姓
    private Account account; // 账户

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
