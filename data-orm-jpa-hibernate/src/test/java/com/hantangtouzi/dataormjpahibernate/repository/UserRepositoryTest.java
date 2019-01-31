package com.hantangtouzi.dataormjpahibernate.repository;

import com.hantangtouzi.dataormjpahibernate.config.TestDataConfig;
import com.hantangtouzi.dataormjpahibernate.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2018/7/11 21:20
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDataConfig.class)
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    public void testGetUserById() {
        Long id = 1L;
        User user = userRepository.getUserById(id);
        Assert.assertEquals("zhangsan", user.getUsername());
    }

    @Test
    @Transactional
    public void testFindUsers() {
        List<User> users = userRepository.findUsers();
        Assert.assertEquals(2, users.size());
    }
}
