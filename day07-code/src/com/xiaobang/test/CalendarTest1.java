package com.xiaobang.test;

import java.util.Calendar;

public class CalendarTest1 {
    public static void main(String[] args) {
        /*
            判断出2050年3月1日是否是疯狂星期四
         */

        Calendar c = Calendar.getInstance();
        c.set(2024, 2, 1);  // month:0~11 代表 月份1~12

        String[] weeks = {" ", "星期日", "星期一", "星期二", "星期三","星期四", "星期五", "星期六"};
        int weekIndex = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(weeks[weekIndex]);
    }
}
