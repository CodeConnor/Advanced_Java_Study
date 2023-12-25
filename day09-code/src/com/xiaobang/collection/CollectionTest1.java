package com.xiaobang.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest1 {
    public static void main(String[] args) {

        Collection<String> c = new ArrayList<>();

        c.add("aaa");
        System.out.println(c);

        c.clear();
        System.out.println(c);

        c.add("aaa");
        c.add("bbbb");
        c.add("cccc");

        c.remove("aaa");
        System.out.println(c);

        System.out.println(c.contains("bbbb"));

        System.out.println(c.isEmpty());

        System.out.println(c.size());
    }
}
