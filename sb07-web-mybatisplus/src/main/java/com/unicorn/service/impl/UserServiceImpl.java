package com.unicorn.service.impl;

import com.unicorn.entity.User;
import com.unicorn.mapper.UserMapper;
import com.unicorn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * </p>
 * Created on 2021/04/16 15:46
 *
 * @author Unicorn
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        return userMapper.selectById(id);
    }
}
