package com.hantangtouzi.datacache.dao;

import com.hantangtouzi.datacache.config.Config;
import com.hantangtouzi.datacache.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2019-02-01 14:20:25
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
        user.setId(10);
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
        user.setId(2);
        user.setUsername("abc");
        user.setPassword("abc");
        userDao.updateUser(user);
        List<User> users = userDao.findUsers();
        for (User u : users) {
            System.out.println(u);
        }
    }
}
