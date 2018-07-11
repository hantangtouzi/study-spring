package com.hantangtouzi.sample.repository;

import com.hantangtouzi.sample.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author WilliamChang.
 * Created on 2018/7/11 16:31
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = com.hantangtouzi.sample.config.TestDataConfig.class)
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testGetUserById() {
        //System.out.println(userRepository == null);
        Long id = 1L;
        User user = userRepository.getUserById(id);
        Assert.assertEquals("zhangsan", user.getUsername());
    }
}