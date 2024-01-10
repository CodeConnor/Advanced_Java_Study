package com.xiaobang.hash;

import com.xiaobang.domain.Student;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();

        hs.add(new Student("xiaohua", 18));
        hs.add(new Student("xiaoming", 18));
        hs.add(new Student("lihua", 18));
        hs.add(new Student("lihua", 18));

        System.out.println(hs);
    }
}
