package com.xyd.java;

import redis.clients.jedis.Jedis;

//本地连接虚拟机中redis
public class RedisJavaFromVMware {
    public static void main(String[] args) {
        Jedis jedis=new Jedis("192.168.65.128",6379);
        jedis.auth("chen1212");
        System.out.println("连接成功");
        System.out.println("服务正在运行："+jedis.ping());
        jedis.set("runoobkeyVM", "www.runoob.com");
        System.out.println("redis 存储的字符串为: "+ jedis.get("runoobkeyVM"));
    }
}
