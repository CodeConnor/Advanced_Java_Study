package com.xiaobang.JDK8.Interval;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationDemo {
    public static void main(String[] args) {
        // 创建其他时间对象
        LocalDateTime otherDate = LocalDateTime.of(2023, 12, 17, 12, 00, 00);
        System.out.println(otherDate);

        // 创建今天的时间对象
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        // 创建时间间隔对象
        Duration between = Duration.between(otherDate, today);
        System.out.println(between.toDays());
        System.out.println(between.toHours());
        System.out.println(between.toMinutes());
        System.out.println(between.toSeconds());
        System.out.println(between.toMillis());
        System.out.println(between.toNanos());
    }
}
