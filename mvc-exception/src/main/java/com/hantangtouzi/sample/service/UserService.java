package com.hantangtouzi.sample.service;

import com.hantangtouzi.sample.dao.UserDao;
import com.hantangtouzi.sample.entity.User;
import com.hantangtouzi.sample.exception.UserNoFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WilliamChang.
 * Created on 2018/7/12 9:24
 */

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User getUserById(Long id) throws UserNoFoundException {
        User user = userDao.getUserById(id);
        if (user == null) {
            throw new UserNoFoundException();
        }
        return user;
    }
}
