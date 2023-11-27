package com.xiaobang.api.statement;


import com.mysql.cj.jdbc.Driver;

import java.sql.*;

/**
 * 使用statement查询t_user表下的全部数据
 */
public class StatementQueryDemo {
    public static void main(String[] args) throws SQLException {
        // 1. 注册驱动
        DriverManager.registerDriver(new Driver());

        // 2. 创建连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_jdbc", "root", "123456");

        // 3. 创建能发送SQL语句的对象
        Statement statement = connection.createStatement();

        // 4. 发送SQL语句, 获取结果集
        String sql = "select * from t_user;";
        ResultSet resultSet = statement.executeQuery(sql);

        // 5. 解析结果集
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String account = resultSet.getString("account");
            String password = resultSet.getString("PASSWORD");
            String nickname = resultSet.getString("nickname");
            System.out.println(id+"--"+account+"--"+password+"--"+nickname);
        }

        // 6. 释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
