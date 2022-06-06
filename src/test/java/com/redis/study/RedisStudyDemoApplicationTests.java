package com.redis.study;

import com.redis.study.config.RedisClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class RedisStudyDemoApplicationTests {

    @Autowired
    RedisClient redisClient;

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Test
    void contextLoads() {
        try {
            System.out.println(redisClient.get("dkz_test"));
            ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
            System.out.println(ops.get("dkz_test"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
