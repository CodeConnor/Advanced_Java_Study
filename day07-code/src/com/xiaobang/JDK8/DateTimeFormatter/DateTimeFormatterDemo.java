package com.xiaobang.JDK8.DateTimeFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年M月d日");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        String format = dateTimeFormatter.format(now);
        System.out.println(format);

        // 解析
        LocalDate parse = LocalDate.parse(format, dateTimeFormatter);
        System.out.println(parse);
    }
}
