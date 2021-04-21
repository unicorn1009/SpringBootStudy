package com.unicorn.controller;

import com.unicorn.entity.User;
import com.unicorn.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * </p>
 * Created on 2021/04/16 15:15
 *
 * @author Unicorn
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public User u1(@PathVariable("id") Long id){
        log.info("查询的id为{}",id);
        return userService.getUserById(id);
    }
}
