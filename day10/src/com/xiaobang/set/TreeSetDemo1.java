package com.xiaobang.set;

import java.util.TreeSet;

public class TreeSetDemo1 {
    // 测试TreeSet的排序与去重特性
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();

        ts.add("a");
        ts.add("d");
        ts.add("b");
        ts.add("c");
        ts.add("e");
        ts.add("a");
        ts.add("a");
        ts.add("a");

        System.out.println(ts);
    }
}
