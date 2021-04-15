package com.unicorn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * </p>
 * Created on 2021/04/15 16:47
 *
 * @author Unicorn
 */
@RestController
public class TestDruidController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("sql")
    public Long queryStudent(){
        Long count = jdbcTemplate.queryForObject("select count(*) from student", Long.class);
        return count;
    }
}
