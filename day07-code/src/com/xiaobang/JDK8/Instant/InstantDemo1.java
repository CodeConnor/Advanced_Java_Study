package com.xiaobang.JDK8.Instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo1 {
    public static void main(String[] args) {
        Instant instant = Instant.now();  // 该时间戳有时差
        System.out.println("当前时间戳 : " + instant);

        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));  // 矫正时差
        System.out.println(zonedDateTime);
    }


}
