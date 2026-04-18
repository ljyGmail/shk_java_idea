package com.atguigu08.constructor.exer3;

/**
 * ClassName: CustomerTest
 * Package: com.atguigu08.constructor.exer3
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 18. 오후 1:01
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {

        // 创建Customer实例
        Customer customer = new Customer("Jane", "Smith");

        // Account account = new Account(1000, 2000, 0.0123);
        // customer.setAccount(account);

        // 匿名对象
        customer.setAccount(new Account(1000, 2000, 0.0123));

        // 针对于客户的账户进行取钱、存钱的操作
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        System.out.println("Customer [" + customer.getLastName() + ", " + customer.getFirstName()
                + "] has an account: id is " + customer.getAccount().getId() + ", annualInterestRate is "
                + customer.getAccount().getAnnualInterestRate() * 100 + "%, balance is "
                + customer.getAccount().getBalance() + ".");

        /*
        关于匿名对象
        1. 匿名对象往往只能被调用一次。
        2. 匿名对象常常作为实参传递给方法的形参。
         */
        new Account(10001, 2000, 0.0123).withdraw(1000);
        System.out.println(new Account(10001, 2000, 0.0123).getBalance());
    }
}
