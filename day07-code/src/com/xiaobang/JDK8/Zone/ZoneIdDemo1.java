package com.xiaobang.JDK8.Zone;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneIdDemo1 {
    public static void main(String[] args) {
        // 获取Java中支持的所有时区
        Set<String> set = ZoneId.getAvailableZoneIds();
        System.out.println(set);
        System.out.println(set.size());

        // 获取系统默认时区对象
        ZoneId sys = ZoneId.systemDefault();
        System.out.println(sys);

        // 获取指定时区对象
        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneId);

        // 使用时区对象生成时间戳
        ZonedDateTime zonedDateTime = Instant.now().atZone(zoneId);
        System.out.println(zonedDateTime);
    }
}
