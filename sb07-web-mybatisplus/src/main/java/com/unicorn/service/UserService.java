package com.unicorn.service;

import com.unicorn.entity.User;
import com.unicorn.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * </p>
 * Created on 2021/04/16 15:16
 *
 * @author Unicorn
 */

public interface UserService {


    User getUserById(Long id);

}
