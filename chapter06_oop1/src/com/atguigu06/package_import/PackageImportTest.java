package com.atguigu06.package_import;

import com.atguigu05.method_more._04recursion.RecursionTest;
import com.atguigu05.method_more._04recursion.exer2.RabbitExer;

import java.lang.reflect.Field;
import java.util.*;

import static java.lang.Math.PI;
import static java.lang.System.out;


/**
 * ClassName: PackageImportTest
 * Package: com.atguigu06.package_import
 * Description:
 *
 * @Author ljy
 * @Create 2026. 4. 13. 오후 10:58
 * @Version 1.0
 */
public class PackageImportTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList list = new ArrayList();

        HashMap map = new HashMap();

        HashSet set = new HashSet();

        String str = "Hello";
        out.println("hello");

        Person p = new Person();

        Field field = null;

        RecursionTest test = null;
        RabbitExer exer = null;

        // Date可以使用import的方式指明
        Date date = null;

        // 使用全类名的方式
        java.sql.Date date1 = new java.sql.Date(1231231231L);

        out.println("hello");
        out.println(PI);
    }
}
