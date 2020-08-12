package com.redisJava.app;

import redis.clients.jedis.Jedis;

public class App {
    public static void main( String[] args )
    {
        Jedis jedis = new Jedis("127.0.0.1");
        System.out.println("Connection to the server successful");
        System.out.println("Server is running: " + jedis.ping());
        System.out.println();

        RedisStrings redisStrings = new RedisStrings(jedis);
        System.out.println("Function: experimentWithRedisStrings ");
        redisStrings.experimentWithRedisString();
        System.out.println();

        RedisLists redisLists = new RedisLists(jedis);
        System.out.println("Function: experimentWithRedisList ");
        redisLists.experimentWithRedisList();
        System.out.println();

        RedisSets redisSets = new RedisSets(jedis);
        System.out.println("Function: experimentWithRedisSets ");
        redisSets.experimentWithRedisSets();
        System.out.println();

        RedisHashes redisHashes = new RedisHashes(jedis);
        System.out.println("Function: experimentWithRedisHashes ");
        redisHashes.experimentWithRedisHashes();
        System.out.println();

        Miscellaneous miscellaneous = new Miscellaneous();
        System.out.println("Function: whetherBothClientsAreDifferentOrNot ");
        miscellaneous.whetherBothClientsAreDifferentOrNot();
        System.out.println();
    }
}
