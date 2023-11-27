package com.xiaobang.api.preparedstatement;

import java.sql.*;
import java.util.Scanner;

/**
 * 使用预编译的Statement完成用户登录
 */

public class PSUserLoginDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String usernameInput = sc.next();
        System.out.println("请输入密码:");
        String passwordInput = sc.next();

        // 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 创建连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_jdbc", "root", "123456");

        // 编写SQL语句
        String sql = "select * from t_user where account = ? and password = ?;";

        // 创建PreparedStatement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // 对占位符赋值
        preparedStatement.setObject(1, usernameInput);
        preparedStatement.setObject(2, passwordInput);

        // 发送SQL语句, 返回执行结果
        ResultSet resultSet = preparedStatement.executeQuery();

        // 解析结果集
        if (resultSet.next()) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();

    }
}
