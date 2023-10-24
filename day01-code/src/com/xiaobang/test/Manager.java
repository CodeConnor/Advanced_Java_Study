package com.xiaobang.test;

public class Manager extends Employee{
    private double bonus;

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, int age, double salary, double bonus) {
        super(name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * 成员方法
     */
    public String work() {
        String info = super.work();
        return info + ",奖金为" + bonus + "的项目经理正在分配任务...";
    }
}
