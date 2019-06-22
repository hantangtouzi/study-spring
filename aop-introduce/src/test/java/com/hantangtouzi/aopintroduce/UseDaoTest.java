package com.hantangtouzi.aopintroduce;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author WilliamChang.
 * Created on 2019-06-22 08:14:13
 */

public class UseDaoTest {

    @Test
    public void sayHelo() {
        ApplicationContext context = new AnnotationConfigApplicationContext(com.hantangtouzi.aopintroduce.Config.class);
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.sayHello();
    }
}