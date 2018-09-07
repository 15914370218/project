package com.xyd.java;

import redis.clients.jedis.Jedis;

//本地链接阿里云服务器的Redis服务器
public class RedisJavaFromECS {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("47.107.76.201",6379);
        jedis.auth("chen1212");
        System.out.println("连接成功");
        System.out.println("服务正在运行："+jedis.ping());
        jedis.set("runoobkeyECS", "www.runoob.com");
        System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkeyECS"));
    }
}
