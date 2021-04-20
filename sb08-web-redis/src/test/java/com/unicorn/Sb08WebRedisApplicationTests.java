package com.unicorn;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class Sb08WebRedisApplicationTests {

	@Test
	void contextLoads() {
	}


	// StringRedisTemplate 底层默认使用的是Lettuce客户端
	@Autowired
	StringRedisTemplate redisTemplate;

	@Test
	void testRedis(){
		ValueOperations<String, String> operations = redisTemplate.opsForValue();
		String name = operations.get("name");
		System.out.println(name);
	}

}
