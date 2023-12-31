package com.xiaobang.stonepuzzle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    // 定义数组, 用于判断是否胜利
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    // 定义变量存储0号元素的行和列的索引
    int row;
    int col;
    // 定义变量存储移动步数
    int count;

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
     * 初始化数据(打乱方块, 打乱数组元素), 找出0号元素索引
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

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] == 0) {
                    row = i;
                    col = j;
                }
            }
        }
    }

    /**
     * 绘制游戏界面
     */
    public void paintView() {
        // 绘制方块前清除所有方块
        getContentPane().removeAll();

        // 判断是否胜利并绘制胜利界面
        if (victory()) {
            JLabel winLabel = new JLabel(new ImageIcon(
                    "D:\\JavaProject\\Advanced-Codes\\day04-code\\src\\com\\xiaobang\\stonepuzzle\\image\\win.png"
            ));
            winLabel.setBounds(124, 230, 266, 88);
            getContentPane().add(winLabel);
        }

        // 添加步数组件
        JLabel stepLabel = new JLabel("步数:" + count);
        stepLabel.setBounds(50, 20, 100, 20);
        getContentPane().add(stepLabel);

        // 添加重新开始按钮
        JButton restartButton = new JButton("重新开始");
        restartButton.setBounds(350, 20, 150, 20);
        getContentPane().add(restartButton);
        restartButton.setFocusable(false); // 将焦点从按钮上移除, 这样才能移动方块
        // 将初始化游戏绑定在按钮上
        restartButton.addActionListener(e -> {
            count = 0;
            initData();
            paintView();
        });

        // 使用循环加载界面中的方块
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                JLabel cubeLabel = new JLabel(new ImageIcon(
                        "D:\\JavaProject\\Advanced-Codes\\day04-code\\src\\com\\xiaobang\\stonepuzzle\\image\\" + data[x][y] + ".png"));
                cubeLabel.setBounds(50 + 100 * y, 90 + 100 * x, 100, 100);
                getContentPane().add(cubeLabel);
            }

        }

        // 加载背景
        JLabel backgroundLabel = new JLabel(new ImageIcon(
                "D:\\JavaProject\\Advanced-Codes\\day04-code\\src\\com\\xiaobang\\stonepuzzle\\image\\background.png"
        ));
        backgroundLabel.setBounds(26, 30, 450, 484);
        getContentPane().add(backgroundLabel);

        // 重新绘制界面
        getContentPane().repaint();
    }


    @Override
    public void keyPressed(KeyEvent e) {
        // 获取键盘按键的ASCII码值
        int keyCode = e.getKeyCode();
        // 移动方块
        moveCube(keyCode);
        // 绘制界面
        paintView();

    }

    /**
     * 此方法用于移动方块的业务
     */
    private void moveCube(int keyCode) {
        // 判断是否游戏胜利, 胜利后不允许再移动方块
        if (victory()) {
            return;
        }

        // 通过获取按键的值, 判断移动方向
        if (keyCode == 37) {
            // 判断移动后是否索引越界
            if (col == 0) {
                return;
            }

            int temp = data[row][col];
            data[row][col] = data[row][col - 1];
            data[row][col - 1] = temp;
            col--;
            count++;
        } else if (keyCode == 38) {
            if (row == 0) {
                return;
            }

            int temp = data[row][col];
            data[row][col] = data[row - 1][col];
            data[row - 1][col] = temp;
            row--;
            count++;
        } else if (keyCode == 39) {
            if (col == 3) {
                return;
            }

            int temp = data[row][col];
            data[row][col] = data[row][col + 1];
            data[row][col + 1] = temp;
            col++;
            count++;
        } else if (keyCode == 40) {
            if (row == 3) {
                return;
            }

            int temp = data[row][col];
            data[row][col] = data[row + 1][col];
            data[row + 1][col] = temp;
            row++;
            count++;
        } else if (keyCode == 90) {
            // 恢复方块
            // 覆盖数组时需要使用完整格式不能省略new
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
        }
    }

    /**
     * 此方法用于判断游戏是否胜利, 胜利返回true
     */
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
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
