package com.xiaobang.test;

/*
    需求:键盘录入学生的姓名和年龄,封装为Student学生对象
 */

import com.xiaobang.domain.Student;
import java.util.Scanner;

public class TryCatchTest {
    public static void main(String[] args) {
        Student student = new Student();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名:");
        String name = sc.nextLine();
        student.setName(name);

        System.out.println("请输入学生年龄:");
        int age = 0;
        while (true) {
            try {
                age = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("您输入的年龄有误, 请重新输入:");
            }
        }

        student.setAge(age);


        System.out.println(student);
    }
}
