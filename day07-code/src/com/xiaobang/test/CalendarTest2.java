package com.xiaobang.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarTest2 {
    public static void main(String[] args) throws ParseException {
        /*
        需求:键盘录入一个日期字符串,程序输出这个日期是一年中的第多少天
         */
        // 键盘录入日期
        /*
        方法1 : 键盘直接录入整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = sc.nextInt();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("请输入日期:");
        int day = sc.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day);
        int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
        System.out.println("该日期是一年中的第" + dayOfYear + "天");
         */

        // 方法2 : 键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期(格式:1970年1月1日):");
        String dateStr = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = dateFormat.parse(dateStr);

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
        System.out.println("该日期是一年中的第" + dayOfYear + "天");
    }
}
