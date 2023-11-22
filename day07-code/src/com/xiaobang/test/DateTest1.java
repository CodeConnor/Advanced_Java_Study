package com.xiaobang.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest1 {
    /*
        练习 : 计算你来到了这个世界多少天, 键盘录入生日
     */
    public static void main(String[] args) throws ParseException {
        // 录入生日
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入生日年份:");
        String year = sc.next();
        System.out.println("请输入生日月份:");
        String month = sc.next();
        System.out.println("请输入生日日期:");
        String day = sc.next();

        // 将生日创建为对象, 并转换为毫秒
        String birthString = year + "-" + month + "-" + day;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = simpleDateFormat.parse(birthString);

        // 创建今天的日期对象, 并转换为毫秒
        Date todayDate = new Date();

        // 计算日期差值, 将结果转换为对象
        Long diff = todayDate.getTime() - birthdayDate.getTime();
        int result = (int) (diff / (1000 * 60 * 60 * 24));
        System.out.println("你来到这个世界已经" + result + "天了!" );

    }

}
