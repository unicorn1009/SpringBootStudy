package com.unicorn.service;

import com.unicorn.entity.Student;
import com.unicorn.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author unicorn
 * @create 2021-04-16 10:41 上午
 */
@Service
public class StudentService {
    @Autowired
    public StudentMapper studentMapper;

    public Student getStudentById(int id){
        return studentMapper.getStudentById(id);
    }

    public List<Student> getStudents(){
        return studentMapper.getAllStudents();
    }
}
