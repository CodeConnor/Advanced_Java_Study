package com.xiaobang.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });  // 使用匿名内部类实现倒序排列, 去掉该类为正序排列

        ts.add("aa");
        ts.add("aaaaaa");
        ts.add("aaaa");
        ts.add("a");
        ts.add("aaa");

        System.out.println(ts);
    }
}
