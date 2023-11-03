package com.xiaobang.stonepuzzle;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(514, 595);  // 窗体尺寸
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // 关闭窗体停止虚拟机
        jFrame.setTitle("石头迷阵Version1.0");  // 窗体上方标题
        jFrame.setAlwaysOnTop(true);  // 窗体置顶
        jFrame.setLocationRelativeTo(null);  // 设置窗口居中
        jFrame.setVisible(true);  // 窗体可见

    }
}
