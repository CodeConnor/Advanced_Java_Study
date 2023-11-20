package com.xiaobang.regex;

public class RegexDemo {
    public static void main(String[] args) {
        /*
            [abc]  只能是a,b,或c的其中之一
            [^abc]  除了a,b,c之外的任何字符
            [a-zA-Z]  a到zA到Z,包括(范围)
            [a-d[m-p]]  a到d,或m通过p:([a-dm-p]联合)
            [a-z&&[def]]  d,e,或f(交集)
            [a-z&&[^bc]]  a到z,除了b和c:([ad-z]减法)
            [a-z&[^m-p]]  a到z,除了m到p:([a-lq-z]减法)

        ------------------------------------------------------

            .  任何字符
            \d  一个数字:[0-9]
            \D  非数字:[^0-9]
            \s  一个空白字符:[  \t\n\x0B\f\r]
            \s  非空白字符:[^\s]
            \w  英文、数字、下划线:[a-zA-Z_0-9]
            \W  一个非单词字符:[^\w]

       -------------------------------------------------------

            ? : 1次或0次
            * : 0次或多次(任意次数)
            + : 1次或多次(至少1次)
            {n} : 正好n次
            {n, } : 至少n次
            {n,m} : 至少n次但不超过m次
         */

        String regex1 = "[abc]";
        System.out.println("a".matches(regex1));

        String regex2 = "\\d";
        System.out.println("1".matches(regex2));

        String regex3 = "\\d+";
        System.out.println("1123456".matches(regex3));



    }
}
