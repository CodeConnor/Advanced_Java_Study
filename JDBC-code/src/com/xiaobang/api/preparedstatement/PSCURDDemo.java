package com.xiaobang.api.preparedstatement;

import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        String sql = "select id, account, PASSWORD, nickname from t_user;";

        // 创建preparedStatement
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // 发送SQL语句, 返回执行结果
        ResultSet resultSet = preparedStatement.executeQuery();

        // 解析结果集, 使用list<map>结构存储结果并输出
        // 创建list
        List<Map> list = new ArrayList<>();

        // 获取结果集的元数据
        ResultSetMetaData metaData = resultSet.getMetaData();

        // 获取元数据中的列数
        int columnCount = metaData.getColumnCount();

        while (resultSet.next()) {
            // 创建Map
            Map map = new HashMap();
            // 将结果通过键值对的形式存入map
            /*
                手动解析结果集, 不灵活, 不推荐
            map.put("id", resultSet.getInt("id"));
            map.put("account", resultSet.getString("account"));
            map.put("password", resultSet.getString("PASSWORD"));
            map.put("nickname", resultSet.getString("nickname"));
            */
            // 遍历结果集的列, 结果集的索引从1开始
            for (int i = 1; i <= columnCount; i++) {
                // 获取列的值, 使用Object类接收可以接收任意类型的值
                Object value = resultSet.getObject(i);

                // 获取列名称, 使用getColumnLabel可获取列的别名且别名优先
                // 而使用getColunName只能获取列的原名称无法获取别名, 推荐使用Label
                String columnLabel = metaData.getColumnLabel(i);

                // 将列名和列的值作为键值对添加到map中
                map.put(columnLabel, value);

            }

            // 将map添加到list中
            list.add(map);

        }
        // 输出结果
        System.out.println(list);

        // 关闭资源
        resultSet.close();
        preparedStatement.close();
        connection.close();

    }

}
