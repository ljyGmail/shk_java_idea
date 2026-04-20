package com.atguigu05._super.exer3;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    // public Account() {
    // }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    // public void setBalance(double balance) {
    //     this.balance = balance;
    // }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * 获取月利率
     *
     * @return 月利率
     */
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    /**
     * 取钱操作
     *
     * @param amount
     */
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("余额不足!");
        }
    }

    /**
     * 存钱操作
     *
     * @param amount
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
