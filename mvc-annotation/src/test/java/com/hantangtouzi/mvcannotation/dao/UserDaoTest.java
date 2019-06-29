package com.hantangtouzi.mvcannotation.dao;

import com.hantangtouzi.mvcannotation.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author WilliamChang.
 * Created on 2019-06-2019/6/29 13:16:15
 */

public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void testFindUserbyId() {
        User user = userDao.findUserById(1L);
        System.out.println(user);
    }
}
