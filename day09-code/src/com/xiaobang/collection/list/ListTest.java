package com.xiaobang.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        list.add("dddd");

        System.out.println(list);
        // 使用ListIterator遍历
        ListIterator<String> lli = list.listIterator();
        while (lli.hasNext()) {
            String next = lli.next();
            System.out.println(next);
        }
        System.out.println("--------------------------------");

        // 倒序遍历
        while (lli.hasPrevious()) {
            String previous = lli.previous();
            System.out.println(previous);
        }
    }
}
