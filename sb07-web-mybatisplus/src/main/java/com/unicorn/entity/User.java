package com.unicorn.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * <p>
 * </p>
 * Created on 2021/04/16 15:14
 *
 * @author Unicorn
 */
@Data
@TableName("user")  // 指定该对象映射的数据库表名, 不写此注解则默认映射同名表
public class User {
    private Long id;
    private String name;
    private int age;
    private String email;
}
