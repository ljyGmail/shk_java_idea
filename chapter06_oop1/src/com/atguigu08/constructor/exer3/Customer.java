package com.atguigu08.constructor.exer3;

/**
 * ClassName: Customer
 * Package: com.atguigu08.constructor.exer3
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 18. 오후 12:58
 * @Version 1.0
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Account account;

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

    public void setAccount(Account a){
        account=a;
    }

    public  Account getAccount(){
        return account;
    }
}
