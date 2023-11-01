package com.xiaobang.block;

public class BlockTest {
    public static void main(String[] args) {
        {
            // 将num变量的作用域限定在大括号中, 可以提前释放内存
            int num = 10;
            System.out.println(num);
        }

        Test t1 = new Test();
        Test t2 = new Test(10);

    }
}

class Test {
    {
        System.out.println("Test的构造代码块");
    }

    static {
        System.out.println("Test类的静态代码块");
    }

    public Test() {
        System.out.println("空参构造方法...");
    }

    public Test(int num) {
        System.out.println("带参构造方法...");
    }
}
