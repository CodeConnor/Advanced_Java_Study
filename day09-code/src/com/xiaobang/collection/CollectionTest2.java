package com.xiaobang.collection;

import com.xiaobang.domain.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest2 {
    public static void main(String[] args) {

        Collection<Student> c = new ArrayList<>();

        c.add(new Student("lihua", 20));
        c.add(new Student("xiaoming", 21));
        c.add(new Student("xiaohua", 22));

        // 生成迭代器
        Iterator<Student> it = c.iterator();

        // 遍历
        while (it.hasNext()) {
            Student stu = it.next();
            System.out.println(stu.getName() + "---" + stu.getAge());
        }
    }
}
