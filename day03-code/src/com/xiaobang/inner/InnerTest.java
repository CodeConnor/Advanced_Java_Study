package com.xiaobang.inner;

import org.w3c.dom.ls.LSOutput;

public class InnerTest {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        System.out.println(oi.num);
        oi.show();
    }
}

class Outer {
    private void method() {
        System.out.println("Outer...method...");
        // 外部类访问内部类成员
        Inner inner = new Inner();
        inner.num = 20;
        System.out.println(inner.num);
    }



    class Inner {
        int num = 10;

        public void show(){
            System.out.println("inner...show...");
            // 内部类访问外部类成员
            method();
        }
    }
}
