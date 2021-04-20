package com.unicorn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.unicorn.mapper")
public class Sb07WebMybatisplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb07WebMybatisplusApplication.class, args);
	}

}


