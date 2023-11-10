package com.xiaobang.stonepuzzle;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class MainFrame extends JFrame implements KeyListener {

    // 定义二维数组, 用该数组当做图片的指针
    int[][] data = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    public MainFrame() {
        // 监听键盘输入
        // 窗体对象.addKeyLisener(KeyLisener实现类对象)
        this.addKeyListener(this);
        // 初始化窗体
        initFrame();
        // 打乱方块
        initData();
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
     * 初始化数据(打乱方块, 打乱数组元素)
     */
    public void initData() {
        Random r = new Random();
        // 遍历数组中的元素
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                // 获取随机索引
                int randomX = r.nextInt(4);
                int randomY = r.nextInt(4);

                // 交换数组中的元素
                int temp = data[i][j];
                data[i][j] = data[randomX][randomY];
                data[randomX][randomY] = temp;
            }
        }
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



    @Override
    public void keyPressed(KeyEvent e) {
        // 获取键盘按键的ASCII码值
        int keyCode = e.getKeyCode();
        // 移动方块
        moveCube(keyCode);

    }

    /**
     * 此方法用于移动方块的业务
     */
    private static void moveCube(int keyCode) {
        if (keyCode == 37) {
            System.out.println("左移动");
        } else if (keyCode == 38) {
            System.out.println("上移动");
        } else if (keyCode == 39) {
            System.out.println("右移动");
        } else if (keyCode == 40) {
            System.out.println("下移动");
        }
    }

    // -------------------------------------------------
    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
    // -------------------------------------------------
}
