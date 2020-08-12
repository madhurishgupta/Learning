package com.redisJava.app;

import lombok.AllArgsConstructor;
import redis.clients.jedis.Jedis;

@AllArgsConstructor
public class RedisHashes {
    private Jedis jedis;

    public void experimentWithRedisHashes() {
        jedis.hset("user1", "Name", "Madhurish");
        jedis.hset("user1", "Address", "Burhanpur");
        System.out.println("user1 Name is " + jedis.hget("user1", "Name"));
        System.out.println("user1 Address is " + jedis.hget("user1", "Address"));
    }
}
