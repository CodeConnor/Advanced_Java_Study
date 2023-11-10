package com.xiaobang.stonepuzzle;

import javax.swing.*;

public class MainFrame extends JFrame {

    // 定义二维数组, 用该数组当做图片的指针
    int[][] data = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    public MainFrame() {
        // 初始化窗体
        initFrame();
        // 绘制界面
        paintView();
        // 窗体可见
        setVisible(true);

    }

    /**
     * 初始化窗体
     */
    public void initFrame() {
        setSize(514, 595);  // 窗体尺寸
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  // 关闭窗体停止虚拟机
        setTitle("石头迷阵Version1.0");  // 窗体上方标题
        setAlwaysOnTop(true);  // 窗体置顶
        setLocationRelativeTo(null);  // 设置窗口居中
        setLayout(null); // 取消默认布局, 防止图片插入充满窗口
    }

    /**
     * 绘制游戏界面
     */
    public void paintView() {
        // 使用循环加载界面中的方块
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                JLabel cube = new JLabel(new ImageIcon(
                        "D:\\JavaProject\\Advanced-Codes\\day04-code\\src\\com\\xiaobang\\stonepuzzle\\image\\" + data[x][y] + ".png"));
                cube.setBounds(50 + 100 * y, 90 + 100 * x, 100, 100);
                getContentPane().add(cube);
            }

        }

        // 加载背景
        JLabel background = new JLabel(new ImageIcon(
                "D:\\JavaProject\\Advanced-Codes\\day04-code\\src\\com\\xiaobang\\stonepuzzle\\image\\background.png"
        ));
        background.setBounds(26, 30, 450, 484);
        getContentPane().add(background);
    }
}
