package com.hantangtouzi.datajdbc.service;

import com.hantangtouzi.datajdbc.dao.UserDao;
import com.hantangtouzi.datajdbc.entity.User;
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
    private UserDao userDao;

    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    public List<User> findUsers() {
        return userDao.findUsers();
    }
}
