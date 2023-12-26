package com.xiaobang.collection;

import com.xiaobang.domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionTest2 {
    public static void main(String[] args) {

        Collection<Student> c = new ArrayList<>();

        c.add(new Student("lihua", 20));
        c.add(new Student("xiaoming", 21));
        c.add(new Student("xiaohua", 22));

        // 生成迭代器
        Iterator<Student> it = c.iterator();

        // 迭代器遍历
        while (it.hasNext()) {
            Student stu = it.next();
            System.out.println(stu.getName() + "---" + stu.getAge());
        }
        System.out.println("--------------------------------");
        // 使用增强for循环遍历
        for (Student stu : c) {
            System.out.println(stu.getName() + "---" + stu.getAge());
        }

        System.out.println("-------------------------------");

        // 使用foreach方法
        c.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student stu) {
                System.out.println(stu.getName() + "---" + stu.getAge());
            }
        });
    }
}
