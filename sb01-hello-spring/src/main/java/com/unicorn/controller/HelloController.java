package com.unicorn.controller;

import com.unicorn.config.PersonConfig;
import com.unicorn.entity.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * </p>
 * Created on 2021/04/11 16:26
 *
 * @author Unicorn
 */
@Slf4j
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String m1() {
        return "Hello, spring boot";
    }

    @RequestMapping("/car")
    public Car m2() {
        log.info("访问了/car");
        return new Car("YD", 160000);
    }

    @Autowired
    private PersonConfig person;

    @RequestMapping("/person")
    public PersonConfig m3() {
        return person;
    }
}


