package com.xiaobang.test;

public class RegexTest {
    public static void main(String[] args) {
        /*
        1.QQ号正则
            不能以0开头
            全部都是数字
            5~12位
        2.手机号正则
            必须是1开头
            第二位:3456789
            全都是数字,必须是11位
        3.邮箱正则
            zhangSan@gmail.cn
            zhangsan163.com
            123456@qq.com
            zhang_san@sina.com
            zhangsan@xxx.edu
            zhangsan@xxx.org
            zhangsan@xxx.qq.com
         */

        String qqRegex = "[1-9]\\d{4,11}";
        System.out.println("123456".matches(qqRegex));

        String telRegex = "[1][3-9]\\d{9}";
        System.out.println("18700000000".matches(telRegex));

        String emailRegex = "\\w+@[\\w&&[^_]]+(\\.[a-z]{2,3})+";
        System.out.println("zhang_san@sina.com".matches(emailRegex));
        System.out.println("zhangsan@xxx.qq.com".matches(emailRegex));

    }
}
