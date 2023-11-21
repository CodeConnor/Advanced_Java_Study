package com.xiaobang.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        // 日期格式化对象
        //        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();  // 默认格式:yyyy/MM/dd ahh:mm
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E a");  // 手动指定格式

        // 日期对象
        Date date = new Date();

        // 将日期对象格式化为字符串
        System.out.println(simpleDateFormat.format(date));

        // 将日期字符串转换为日期对象
        String today = "2023年11月21日";
        SimpleDateFormat sDFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date parse = sDFormat.parse(today);
        System.out.println(parse);


    }
}
