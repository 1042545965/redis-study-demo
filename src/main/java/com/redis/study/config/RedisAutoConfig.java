package com.redis.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * redis配置
 * @author zhangxinlin
 * @date
 *
 */
@Configuration
public class RedisAutoConfig {
	/**
	 * 初始化Redis
	 * @return
	 */
	@Bean
	public RedisClient redisCache(StringRedisTemplate redisTemplate) {
		RedisClient redisCache = new RedisClient();
		redisCache.setRedisTemplate(redisTemplate);
		return redisCache;
	}
}
