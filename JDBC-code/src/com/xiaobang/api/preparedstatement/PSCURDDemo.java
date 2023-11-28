package com.xiaobang.api.preparedstatement;

import org.junit.Test;

import java.sql.*;

/**
 * 使用PreparedStatement进行t_user表的curd动作
 */

public class PSCURDDemo {


    // 测试方法需要导入junit测试包
    @Test
    public void testInsert() throws ClassNotFoundException, SQLException {
        // 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 创建连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_jdbc", "root", "123456");

        // 编写sql语句
        String sql = "insert into t_user(account, password, nickname) values(?, ?, ?);";

        // 创建preparedStatement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // 对占位符赋值
        preparedStatement.setObject(1, "test22");
        preparedStatement.setObject(2, "test22");
        preparedStatement.setObject(3, "test22");

        // 发送SQL语句, 返回执行结果
        int rows = preparedStatement.executeUpdate();
        if (rows > 0) {
            System.out.println("数据插入成功");
        } else{
            System.out.println("数据插入失败");
        }

        // 关闭资源
        preparedStatement.close();
        connection.close();
    }

    @Test
    public void testUpdate() throws ClassNotFoundException, SQLException {
        // 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 创建连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_jdbc", "root", "123456");

        // 编写sql语句
        String sql = "update t_user set nickname = ? where id = ?;";

        // 创建preparedStatement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // 对占位符赋值
        preparedStatement.setObject(1, "测试员");
        preparedStatement.setObject(2, 3);

        // 发送SQL语句, 返回执行结果
        int rows = preparedStatement.executeUpdate();
        if (rows > 0) {
            System.out.println("数据更新成功");
        } else{
            System.out.println("数据更新失败");
        }

        // 关闭资源
        preparedStatement.close();
        connection.close();
    }

    @Test
    public void testDelete() throws ClassNotFoundException, SQLException {
        // 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 创建连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_jdbc", "root", "123456");

        // 编写sql语句
        String sql = "delete from t_user where id = ? or account = ?;";

        // 创建preparedStatement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // 对占位符赋值
        preparedStatement.setObject(1, 4);
        preparedStatement.setObject(2, "test22");

        // 发送SQL语句, 返回执行结果
        int rows = preparedStatement.executeUpdate();
        if (rows > 0) {
            System.out.println("数据删除成功");
        } else{
            System.out.println("数据删除失败");
        }

        // 关闭资源
        preparedStatement.close();
        connection.close();
    }

    @Test
    public void testSelect() throws ClassNotFoundException, SQLException {
        // 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 创建连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_jdbc", "root", "123456");

        // 编写sql语句
        String sql = "select * from t_user where account = ?;";

        // 创建preparedStatement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // 对占位符赋值
        preparedStatement.setObject(1, "test");

        // 发送SQL语句, 返回执行结果
        ResultSet resultSet = preparedStatement.executeQuery();

        // 解析结果集
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String account = resultSet.getString("account");
            String password = resultSet.getString("PASSWORD");
            String nickname = resultSet.getString("nickname");
            System.out.println(id+"--"+account+"--"+password+"--"+nickname);
        }

        // 关闭资源
        resultSet.close();
        preparedStatement.close();
        connection.close();

    }

}
