package com.xiaobang.object;

public class Student {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 重写equals方法


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            // 将obj强制转换为Student类, 以便于调用obj的成员
            Student stu = (Student) obj;
            return this.age == stu.age && this.name.equals(stu.name);
        } else {
            return false;
        }
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
