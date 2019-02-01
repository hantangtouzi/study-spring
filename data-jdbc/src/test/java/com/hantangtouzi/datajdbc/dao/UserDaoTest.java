package com.hantangtouzi.datajdbc.dao;

import com.hantangtouzi.datajdbc.config.Config;
import com.hantangtouzi.datajdbc.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2019-02-01 00:33:44
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class UserDaoTest {
    @Autowired
    private UserDao userDao;

    @Test
    public void listUsers() {
        List<User> users = userDao.findUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setId(10L);
        user.setUsername("abc");
        user.setPassword("abc");
        userDao.addUser(user);
        List<User> users = userDao.findUsers();
        for (User u : users) {
            System.out.println(u);
        }
    }

    @Test
    public void deleteUserById() {
        Long userId = 2L;
        userDao.deleteUserById(userId);
        List<User> users = userDao.findUsers();
        for (User u : users) {
            System.out.println(u);
        }
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(2L);
        user.setUsername("abc");
        user.setPassword("abc");
        userDao.updateUser(user);
        List<User> users = userDao.findUsers();
        for (User u : users) {
            System.out.println(u);
        }
    }
}
