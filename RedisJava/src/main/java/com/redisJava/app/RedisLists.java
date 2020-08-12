package com.redisJava.app;

import lombok.AllArgsConstructor;
import redis.clients.jedis.Jedis;

@AllArgsConstructor
public class RedisLists {

    private Jedis jedis;

    public void experimentWithRedisList() {
        jedis.lpush("numbers", "100");
        jedis.lpush("numbers", "10000");
        System.out.println(jedis.lrange("numbers", 0, 1));
        System.out.println(jedis.lrange("numbers", 0, 1).getClass().getName());
    }
}
