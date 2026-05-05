package com.atguigu07._abstract.exer2;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Employee[] emps = new Employee[2];

        emps[0] = new SalariedEmployee("Harry", 1001, new MyDate(1980, 3, 12), 18000);
        emps[1] = new HourlyEmployee("Ron", 1002, new MyDate(1981, 2, 14), 20, 25);

        System.out.print("请输入当前的月份: ");
        int month = scan.nextInt();


        for (int i = 0; i < emps.length; i++) {
            System.out.println(emps[i].toString());
            System.out.println("工资为: " + emps[i].earnings());

            if (month == emps[i].getBirthday().getMonth()) {
                System.out.println("生日快乐! 加薪100！");
            }
        }

        scan.close();
    }
}
