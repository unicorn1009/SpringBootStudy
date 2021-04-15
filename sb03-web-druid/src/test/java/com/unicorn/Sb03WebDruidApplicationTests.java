package com.unicorn;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@Slf4j
@SpringBootTest
class Sb03WebDruidApplicationTests {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	DataSource dataSource;

	@Test
	void testMysql() {
		Long count = jdbcTemplate.queryForObject("select count(*) from student", Long.class);
		log.info("查询出 {} 条数据",count);
		log.info("数据源:{}",dataSource.getClass());
	}

}
