package com.cn.by.test;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

public class Hello {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.println(jedis.ping());
        HashMap<String,String> hashMap = new HashMap();
        hashMap.put("one","1");
        hashMap.put("two","2");

        System.out.println("redis 存储的hashMap为: "+ jedis.hget("hashMap","one"));
    }
}
