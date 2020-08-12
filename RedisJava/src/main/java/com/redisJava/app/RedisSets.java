package com.redisJava.app;

import lombok.AllArgsConstructor;
import redis.clients.jedis.Jedis;

@AllArgsConstructor
public class RedisSets {

    private Jedis jedis;

    public void experimentWithRedisSets() {
        jedis.sadd("transport", "waterways");
        jedis.sadd("transport", "land");
        jedis.sadd("transport", "airways");
        jedis.sadd("transport", "waterways");
        System.out.println(jedis.smembers("transport"));
        System.out.println(jedis.smembers("transport").getClass().getName());
    }
}
