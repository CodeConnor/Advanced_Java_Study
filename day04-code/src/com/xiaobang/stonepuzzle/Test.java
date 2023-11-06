package com.xiaobang.stonepuzzle;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        // 定义二维数组, 用该数组当做图片的指针
        int[][] data = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 0}
        };

        JFrame jFrame = new JFrame();
        jFrame.setSize(514, 595);  // 窗体尺寸
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // 关闭窗体停止虚拟机
        jFrame.setTitle("石头迷阵Version1.0");  // 窗体上方标题
        jFrame.setAlwaysOnTop(true);  // 窗体置顶
        jFrame.setLocationRelativeTo(null);  // 设置窗口居中
        jFrame.setLayout(null); // 取消默认布局, 防止图片插入充满窗口

        // 使用循环加载界面中的方块
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                JLabel cube = new JLabel(new ImageIcon("D:\\JavaProject\\Advanced-Codes\\day04-code\\src\\com\\xiaobang\\stonepuzzle\\image\\" + data[x][y] + ".png"));
                cube.setBounds(50 + 100 * y, 90 + 100 * x, 100, 100);
                jFrame.getContentPane().add(cube);
            }

        }

        // 加载背景
        JLabel background = new JLabel(new ImageIcon(
                "D:\\JavaProject\\Advanced-Codes\\day04-code\\src\\com\\xiaobang\\stonepuzzle\\image\\background.png"
        ));
        background.setBounds(26, 30, 450, 484);
        jFrame.getContentPane().add(background);

        jFrame.setVisible(true);  // 窗体可见

    }
}
