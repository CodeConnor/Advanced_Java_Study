package com.xiaobang.collection;

import com.xiaobang.domain.Student;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest1 {
    public static void main(String[] args) {

        Collection<Student> c = new ArrayList<>();

        c.add(new Student("lihua", 20));
        c.add(new Student("xiaoming", 21));
        c.add(new Student("xiaohua", 22));

        c.remove(new Student("lihua",20));  // 依赖于equals方法, 对对象做删除时需要重写equals方法
        System.out.println(c);



    }

    private static void method() {
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
