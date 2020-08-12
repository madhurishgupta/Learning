package com.redisJava.app;

import lombok.AllArgsConstructor;
import redis.clients.jedis.Jedis;

@AllArgsConstructor
public class RedisStrings {

    private Jedis jedis;

    public void experimentWithRedisString() {
        jedis.set("cities", "Rome, Madrid, Delhi, Howai");
        System.out.println(jedis.get("cities"));
        System.out.println(jedis.get("cities").getClass().getName());
    }
}
