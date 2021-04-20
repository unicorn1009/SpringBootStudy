package com.unicorn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.unicorn.entity.Student;
import com.unicorn.mapper.StudentMapper;
import com.unicorn.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * </p>
 * Created on 2021/04/16 15:57
 *
 * @author Unicorn
 */
@Service
// ServiceImpl这个实现类实现了IService接口中的方法
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}
