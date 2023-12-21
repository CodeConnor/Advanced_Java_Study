package com.xiaobang.exception;


/*
    异常的处理方式:
    1.try...catch捕获异常
    2. throws
 */
public class HandleExceptionDemo {
    public static void main(String[] args) {
        System.out.println("开始");

        try {
            int[] numbers = null;
            System.out.println(numbers[10]);
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("捕获了运算异常");
        } catch (NullPointerException e) {
            System.out.println("捕获了空指针异常");
        } catch (Exception e) {
            System.out.println("捕获了异常");
        }

        System.out.println("结束");
    }
}
