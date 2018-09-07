package com.xyd.java;

import java.sql.*;

//阿里云服务器上面的ecs服务器
public class JDBCTestFromECS {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println(1);
        Class.forName("com.mysql.jdbc.Driver");
        //Connection conn= DriverManager.getConnection("jdbc:mysql://47.107.76.201:3306/testECS","linyukun","mysql");
        Connection conn= DriverManager.getConnection("jdbc:mysql://47.107.76.201:3306/testECS","root","mysql");
        PreparedStatement insertPs=conn.prepareStatement("insert into user values (1009)");
        insertPs.execute();
        /*PreparedStatement deletePs=conn.prepareStatement("delete from user where uid=?");
        deletePs.setInt(1,1001);
        deletePs.executeUpdate();*/
        PreparedStatement ps=conn.prepareStatement("select * from user");
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(1));
        }
        System.out.println(2);
    }
}
