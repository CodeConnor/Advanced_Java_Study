package com.xiaobang.date;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {

        Date date1 = new Date();
        System.out.println(date1);

        Date date2 = new Date(1000L);
        System.out.println(date2);

        // 常用方法
        System.out.println(date1.getTime());
        System.out.println(date2.getTime());

        Date date3 = new Date();
        date3.setTime(0L);
        System.out.println(date3);
    }
}
