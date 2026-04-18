package com.atguigu08.constructor.exer3;

/**
 * ClassName: Account
 * Package: com.atguigu08.constructor.exer3
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 18. 오후 12:52
 * @Version 1.0
 */
public class Account {
    private int id; // 账号
    private double balance; // 余额
    private double annualInterestRate; // 年利率

    public Account(int i, double b, double a) {
        id = i;
        balance = b;
        annualInterestRate = a;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double a) {
        annualInterestRate = a;
    }

    // 取钱
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("成功取出: " + amount + "元");
        } else {
            System.out.println("余额不足，取款失败");
        }
    }

    // 存钱
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入: " + amount + "元");
        }
    }
}
