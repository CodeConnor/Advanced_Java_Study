package com.xiaobang.myinterface.jdk9;

public class InterfaceTest {
    public static void main(String[] args) {

    }
}

interface Inter {
    void show();

    public static void start() {
        System.out.println("start........");
    }

    public static void end() {
        System.out.println("end.........");
        log();
    }

    private static void log() {
        System.out.println("记录日志信息");
    }
}
