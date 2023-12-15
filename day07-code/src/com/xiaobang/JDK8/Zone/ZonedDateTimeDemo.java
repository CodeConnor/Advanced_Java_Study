package com.xiaobang.JDK8.Zone;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        // 获取当前时间的ZonedDateTime对象
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        System.out.println("--------------------------------");

        // 获取指定时间的ZonedDateTime对象
        ZonedDateTime zonedDateTime = ZonedDateTime.of(
                2023, 12, 12,
                13, 13, 59, 59, ZoneId.systemDefault());
        System.out.println("zonedDateTime: " + zonedDateTime);
        System.out.println("--------------------------------");
    }
}
