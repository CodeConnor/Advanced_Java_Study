package com.xiaobang.JDK8.Interval;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        // 昨天的日期
        LocalDate yesterday = LocalDate.of(2022, 12, 17);
        System.out.println(yesterday);

        // 今天的日期
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // 创建时间间隔对象
        Period period = Period.between(yesterday, today);  // 参数2减去参数1

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(period.toTotalMonths());

    }
}
