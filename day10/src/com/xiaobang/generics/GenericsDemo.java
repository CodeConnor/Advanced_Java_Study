package com.xiaobang.generics;

public class GenericsDemo {
    public static void main(String[] args) {
        Student<String> stu = new Student<>();
        stu.setE("xiaoming");
        String e = stu.getE();
        System.out.println(e);
    }
}

// 泛型类
class Student<E> {
    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
