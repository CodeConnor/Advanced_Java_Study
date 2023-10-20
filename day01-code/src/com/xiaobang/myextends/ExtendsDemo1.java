package com.xiaobang.myextends;

public class ExtendsDemo1 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.setName("xiaoming");
        m.setAge(25);
        m.setSalary(20000);

        System.out.println(m.getName() + "---" + m.getAge() + "---" + m.getSalary());

    }
}

class Employee {
    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {

}

class Engineer extends Employee {

}
