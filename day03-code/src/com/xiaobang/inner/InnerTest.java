package com.xiaobang.inner;

import org.w3c.dom.ls.LSOutput;

public class InnerTest {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        System.out.println(oi.num);
        oi.show();

        MyOuter.MyInner mm = new MyOuter().new MyInner();
        mm.method();
    }
}

class MyOuter {
    int num = 10;

    class MyInner {
        int num = 20;

        public void method() {
            int num = 30;

            System.out.println(num);  // 30
            System.out.println(this.num);  // 20
            System.out.println(MyOuter.this.num);  // 10
        }
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
