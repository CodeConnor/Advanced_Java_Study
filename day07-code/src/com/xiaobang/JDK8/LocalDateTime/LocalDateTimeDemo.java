package com.xiaobang.JDK8.LocalDateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        // 创建对象
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        // 获取指定时间
        int year = now.getYear();
        int month = now.getMonth().getValue();
        int dayOfMonth = now.getDayOfMonth();
        int dayOfWeek = now.getDayOfWeek().getValue();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        System.out.println(year + "年" +
                month + "月" +
                dayOfMonth + "日" + " " +
                "星期" + dayOfWeek + " " +
                hour + ":" + minute + ":" + second
        );

        // 转换时间对象
        LocalDate localDate = now.toLocalDate();
        System.out.println(localDate);
        System.out.println(now.toLocalTime());

        // 修改时间
        LocalDateTime withYear = now.withYear(2020);
        System.out.println("修改前:" + now + ", 修改后:" + withYear);

        // 判断时间是否相等
        System.out.println(withYear.equals(now));

    }
}
