package com.atguigi01._this.exer2;

/**
 * ClassName: BankTest
 * Package: com.atguigi01._this.exer2
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 18. 오후 9:02
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.addCustomer("操", "曹");
        bank.addCustomer("备", "刘");

        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().withdraw(50);

        System.out.println("账户余额为: " + bank.getCustomer(0).getAccount().getBalance());
        // 成功取出: 50.0
        // 账户余额为: 950.0
    }
}
