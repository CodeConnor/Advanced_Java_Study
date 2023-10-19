package com.xiaobang.mystatic;

public class StaticDemo1 {
    public static void main(String[] args) {

        Student stu1 = new Student();
        stu1.name = "xiaoming";
        stu1.age = 22;
        Student.schoool = "highschool";
        System.out.println(stu1.name + "---" + stu1.age + "---" + Student.schoool);

        System.out.println("----------------------------");

        Student stu2 = new Student();
        stu2.name = "lihua";
        stu2.age = 23;
        System.out.println(stu2.name + "---" + stu2.age + "---" + Student.schoool);

    }
}
