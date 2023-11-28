package com.xiaobang.api.preparedstatement;

import org.junit.Test;

import java.sql.*;

public class PSOtherDemo {

    @Test
    public void returnPrimaryKey() throws ClassNotFoundException, SQLException {
        // 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 连接数据库
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_jdbc", "root", "123456");
        // 创建SQL
        String sql = "insert into t_user(account,PASSWORD,nickname) values(?,?,?)";
        // 创建PreparedStatement对象
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        // 设置参数
        statement.setString(1, "xiaobang");
        statement.setString(2, "123456");
        statement.setString(3, "小白");
        // 执行SQL
        int i = statement.executeUpdate();
        if(i > 0) {
            System.out.println("数据插入成功");
            // 主键回显, 获取主键结果集
            ResultSet generatedKeys = statement.getGeneratedKeys();
            // 移动指针
            generatedKeys.next();
            // 获取主键的值
            int primaryInt = generatedKeys.getInt(1);
            System.out.println("id = " + primaryInt);
        } else {
            System.out.println("数据插入失败");
        }

        // 释放资源
        statement.close();
        connection.close();
    }
}
