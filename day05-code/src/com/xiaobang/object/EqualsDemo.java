package com.xiaobang.object;

import java.util.ArrayList;

public class EqualsDemo {
    public static void main(String[] args) {
        Student stu1 = new Student("xiaoming", 18);
        Student stu2 = new Student("xiaoming", 18);

        System.out.println(stu1.equals(stu2));
        System.out.println("------");

        ArrayList<String> list = new ArrayList();
        System.out.println(stu1.equals(list));

    }
}
