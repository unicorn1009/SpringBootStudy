package com.unicorn.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * </p>
 * Created on 2021/04/14 18:57
 *
 * @author Unicorn
 */
@RestController
@RequestMapping("customparam")
public class CustomParamController {

    @PostMapping("student")
    public Student m1(Student stu){
        System.out.println(stu);
        return stu;
    }
}

@Data
class Student{
    String name;
    String gender;
    Integer age;
}
