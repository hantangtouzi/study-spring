package com.hantangtouzi.diintroduce;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * @author WilliamChang.
 * Created on 2019-06-22 06:46:39
 */


public class UserServiceTest {

    @Test
    public void sayHello() {
        ApplicationContext context = new AnnotationConfigApplicationContext(com.hantangtouzi.diintroduce.Config.class);
        UserService userService = (UserService)context.getBean("userService");
        userService.sayHello();
    }
}