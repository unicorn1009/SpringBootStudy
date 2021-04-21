package com.unicorn.mapper;

import com.unicorn.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author unicorn
 * @create 2021-04-16 10:10 上午
 */
@Mapper
public interface StudentMapper {
    @Select("select * from student where id=#{id}")
    Student getStudentById(int id);

    List<Student> getAllStudents();
}
