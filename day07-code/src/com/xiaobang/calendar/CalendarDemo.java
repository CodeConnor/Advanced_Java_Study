package com.xiaobang.calendar;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR, -1);
        System.out.println(c.get(Calendar.YEAR));  // 2022


    }

    private static void setMethod() {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2000);
        c.set(2001, 1, 1);
        System.out.println(c.get(Calendar.YEAR));  // 2001
    }

    private static void getMethod() {
        // 创建对象
        Calendar c = Calendar.getInstance();
        // 获取年
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        // 获取月
        int month = c.get(Calendar.MONTH);
        System.out.println(month + 1);
        // 获取日
        int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(dayOfMonth);
        // 获取星期
        char[] week = {' ', '日', '一', '二', '三', '四', '五', '六'};
        int weekIndex = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(week[weekIndex]);
        // 获取一年中的第几天
        int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
        System.out.println(dayOfYear);
    }
}
