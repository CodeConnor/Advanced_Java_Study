package com.xiaobang.api.statement;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * 通过键盘录入用户名和密码
 * 连接数据库查询输入的登录信息是否正确
 * 正确返回登录成功, 否则返回登录失败
 */
public class StatementUserLoginDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String usernameInput = sc.next();
        System.out.println("请输入密码:");
        String passwordInput = sc.next();

        // 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 获取连接
        /*
        // 两参数方式
        Properties info = new Properties();
        info.put("user", "root");
        info.put("password", "123456");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_jdbc", info);
        */

        // 一参数方式
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_jdbc?user=root&password=123456");

        // 创建发送SQL的对象
        Statement statement = connection.createStatement();

        // 通过statement发送SQL并返回结果集
        String sql = "SELECT * FROM t_user WHERE account = '" + usernameInput + "' AND PASSWORD = '" + passwordInput + "';";
        ResultSet resultSet = statement.executeQuery(sql);

        // 解析结果集
        if (resultSet.next()) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
