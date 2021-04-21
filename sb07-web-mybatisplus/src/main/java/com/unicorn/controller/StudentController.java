package com.unicorn.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.unicorn.entity.Student;
import com.unicorn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * </p>
 * Created on 2021/04/16 15:58
 *
 * @author Unicorn
 */
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("student/all")
    public List<Student> s1(){
        return studentService.list();
    }

    @GetMapping("students")
    public Map<String, Object> s2(@RequestParam(value = "pn", defaultValue = "1") int curPage){

        Map<String, Object> map = new HashMap<>();
        // Page<Student> page 是查询结果
        Page<Student> page = studentService.page(new Page<Student>(curPage, 2),null);
        map.put("page.getCurrent():当前页", page.getCurrent());
        map.put("page.getPages():当前分页总页数", page.getPages());
        map.put("page.getTotal():总数", page.getTotal());
        map.put("page.getCountId():", page.getCountId());
        map.put("page.getMaxLimit():", page.getMaxLimit());
        map.put("page.getOrders():排序字段信息", page.getOrders());
        map.put("page.getSize():每页显示条数，默认 10", page.getSize());
        map.put("page.hasPrevious():是否有前一页", page.hasPrevious());
        map.put("page.hasNext():是否有后一页", page.hasNext());
        map.put("page.getRecords():询数据列表", page.getRecords());

        return map;

    }

    
}