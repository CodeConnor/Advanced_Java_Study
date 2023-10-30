package com.xiaobang.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择支付方式:\n1. 支付平台支付\n2. 银行卡网银支付\n3. 信用卡快捷支付\n:");
        int choice = sc.nextInt();
        // 建立接口的父类引用
        Payment p = null;

        // 支付方式
        System.out.println("请输入支付金额:");
        double userMoney = sc.nextDouble();
        switch (choice) {
            case 1:
                p = new PlatformPaymentImpl();
                p.pay(userMoney);
                break;
            case 2:
                p = new BankcardPaymentImpl();
                p.pay(userMoney);
                break;
            case 3:
                p = new CreditCardPaymentImpl();
                p.pay(userMoney);
                break;
        }


    }
}
