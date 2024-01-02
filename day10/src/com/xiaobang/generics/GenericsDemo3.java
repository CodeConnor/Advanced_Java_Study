package com.xiaobang.generics;

public class GenericsDemo3 {
    public static void main(String[] args) {
        InterImplB<String> impl = new InterImplB<>();
        impl.show("aaa");
    }
}

interface Inter<E> {
    void show(E e);
}

class InterImplA implements Inter<String> {

    @Override
    public void show(String s) {

    }
}

class InterImplB<E> implements Inter<E> {

    @Override
    public void show(E e) {

    }
}
