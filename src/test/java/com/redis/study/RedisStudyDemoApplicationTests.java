package com.redis.study;

import com.redis.study.config.RedisUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RedisStudyDemoApplicationTests {

    @Test
    void contextLoads() {
        RedisUtils.set("redisUtils", "redisUtils");
        System.out.println(RedisUtils.get("redisUtils"));
    }

}
