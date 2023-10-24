package com.xiaobang.test;

public class Coder extends Employee{
    public Coder() {
    }

    public Coder(String name, int age, double salary) {
        super(name, age, salary);
    }

    /**
     * 成员方法
     */
    public String work() {
        String info = super.work();
        return info + "的程序员正在编写代码";
    }
}
