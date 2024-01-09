package com.xiaobang.set;

import com.xiaobang.doamin.Student;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>();

        ts.add(new Student("xiaoming", 20));
        ts.add(new Student("lihua", 19));
        ts.add(new Student("xiaohua", 18));
        ts.add(new Student("xiaogang", 21));

        System.out.println(ts);
    }
}
