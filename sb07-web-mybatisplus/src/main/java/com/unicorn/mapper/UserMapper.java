package com.unicorn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.unicorn.entity.User;

/**
 * <p>
 * </p>
 * Created on 2021/04/16 15:16
 *
 * @author Unicorn
 */
//Mapper 继承该接口后，无需编写 mapper.xml 文件，即可获得CRUD功能
//@Mapper
public interface UserMapper extends BaseMapper<User> {

}
