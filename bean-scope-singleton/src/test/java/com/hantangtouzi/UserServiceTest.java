package com.hantangtouzi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @author WilliamChang.
 * created on 2018/7/6 1:04
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void userServiceShouldNotBeNull() {
        assertNotNull(userService);
    }

}