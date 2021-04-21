package com.unicorn.controller;

import com.unicorn.entity.Student;
import com.unicorn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author unicorn
 * @create 2021-04-16 10:11 上午
 */
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("student/{id}")
    public Student m1(@PathVariable("id") int id){
        return studentService.getStudentById(id);
    }

    @GetMapping("student/all")
    public List<Student> m2(){
        return studentService.getStudents();
    }
}
