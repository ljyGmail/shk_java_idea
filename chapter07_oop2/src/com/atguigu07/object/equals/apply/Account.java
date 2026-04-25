package com.atguigu07.object.equals.apply;

/**
 * ClassName: Account
 * Package: com.atguigu07.object.equals.apply
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 26. 오전 12:58
 * @Version 1.0
 */
public class Account {

    private double balance; // 余额

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(balance, account.balance) == 0;
    }
}
