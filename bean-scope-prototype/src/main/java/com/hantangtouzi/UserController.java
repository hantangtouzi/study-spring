package com.hantangtouzi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author WilliamChang.
 * Created on 2018/7/6 13:23
 */


public class UserController {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UserService userService1 = applicationContext.getBean(UserServiceImpl.class);
        UserService userService2 = applicationContext.getBean(UserServiceImpl.class);

        System.out.println(userService1.hashCode());
        System.out.println(userService2.hashCode());
    }
}
