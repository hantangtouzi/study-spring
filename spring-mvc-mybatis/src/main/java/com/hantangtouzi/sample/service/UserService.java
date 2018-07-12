package com.hantangtouzi.sample.service;

import com.hantangtouzi.sample.entity.User;
import com.hantangtouzi.sample.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2018/7/11 3:42
 */

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }

    public List<User> findUsers() {
        return userMapper.findUsers();
    }
}
