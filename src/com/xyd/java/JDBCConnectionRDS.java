package com.xyd.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//rm-wz9ymg9oozkb405o8.mysql.rds.aliyuncs.com:3306
public class JDBCConnectionRDS {
    public static void main(String[] args) throws Exception {
        System.out.println(1);
        Class.forName("com.mysql.jdbc.Driver");
        //Connection conn= DriverManager.getConnection("jdbc:mysql://rm-wz9ymg9oozkb405o8ro.mysql.rds.aliyuncs.com/test1","root","rds-linyukun1212");
        Connection conn= DriverManager.getConnection("jdbc:mysql://rm-wz9ymg9oozkb405o8ro.mysql.rds.aliyuncs.com/test1","linyukun","linyukun_1");
        //https://rds.aliyuncs.com/?Action=CreateAccount&AccountName=testacc02&AccountPassword=pw1234&DBInstanceId=rm-wz9ymg9oozkb405o8&Format=xml&Version=2014-08-15&AccessKeyId=LTAIDhCJ4Fzlk24a&Signature=&SignatureMethod=HMAC-SHA1&Timestamp=&SignatureVersion=1.0&SignatureNonce=
        PreparedStatement ps=conn.prepareStatement("show databases");
        ResultSet rs=ps.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString(1));
        }
        System.out.println("----------------------------------------------------");
        PreparedStatement ps1=conn.prepareStatement("show tables");
        ResultSet rs1=ps1.executeQuery();
        while (rs1.next()){
            System.out.println(rs1.getString(1));
        }

        System.out.println(3);

    }
}
