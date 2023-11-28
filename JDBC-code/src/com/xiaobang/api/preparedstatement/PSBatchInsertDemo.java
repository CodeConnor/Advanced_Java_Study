package com.xiaobang.api.preparedstatement;

import org.junit.Test;

import java.sql.*;

public class PSBatchInsertDemo {

    @Test
    public void usualInsert() throws ClassNotFoundException, SQLException {
        // 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 连接数据库
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_jdbc", "root", "123456");
        // 创建SQL
        String sql = "insert into t_user(account,PASSWORD,nickname) values(?,?,?)";
        // 创建PreparedStatement对象
        PreparedStatement statement = connection.prepareStatement(sql);


        // 插入10000条数据
        for (int i = 0; i < 10000; i++) {
            // 设置参数
            statement.setString(1, "test" + i);
            statement.setString(2, "test" + i);
            statement.setString(3, "测试员" + i);
            // 执行SQL
            statement.executeUpdate();
        }

        // 释放资源
        statement.close();
        connection.close();

    }
}
