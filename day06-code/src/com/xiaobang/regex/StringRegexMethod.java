package com.xiaobang.regex;

public class StringRegexMethod {
    public static void main(String[] args) {
        String s = "11Hello22 33world44!";
        // 替换字符串中的数字
        System.out.println(s.replaceAll("\\d", ""));
    }
}
