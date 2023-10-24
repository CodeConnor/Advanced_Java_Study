package com.xiaobang.test;

public class Coder extends Employee {
    public Coder() {
    }

    public Coder(String name, int age, double salary) {
        super(name, age, salary);
    }

    /**
     * 成员方法
     */
    public void work() {
        System.out.println("姓名为" + super.getName()
                + ", 年龄为" + super.getAge()
                + ", 工资为" + super.getSalary()
                + "的程序员正在写代码"
        );
    }
}
