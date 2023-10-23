package com.xiaobang.test;

public class Student extends Person{
    private double grade;

    public Student() {
    }

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }



    public void study() {
        System.out.println(
                        "姓名为" + super.getName() +
                        ",年龄为" + super.getAge() +
                        ",成绩为" + grade +
                        "的学生正在听课"
        );
    }
}


