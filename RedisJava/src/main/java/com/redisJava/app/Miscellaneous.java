package com.redisJava.app;

import lombok.NoArgsConstructor;
import redis.clients.jedis.Jedis;

// Checking the working of Jedis
// Creating the two instance of Jedis, found that both the instances are same
// I thought both will different clients and jedis2 can't access datatype of jedis1
// Basically that is called Redis cluster (different instances of Jedis).
// Redis Pool ( One Master and others are its slaves).

@NoArgsConstructor
public class Miscellaneous {
    private final Jedis jedis1 = new Jedis("localhost");
    private final Jedis jedis2 = new Jedis("localhost");
    public void whetherBothClientsAreDifferentOrNot() {
        RedisHashes redisHashes = new RedisHashes(jedis1);
        RedisSets redisSets = new RedisSets(jedis2);
        System.out.println(jedis1.smembers("transport"));
        System.out.println(jedis2.smembers("transport"));
    }
}
