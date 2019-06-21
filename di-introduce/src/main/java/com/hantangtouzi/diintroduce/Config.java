package com.hantangtouzi.diintroduce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author WilliamChang.
 * Created on 2019-06-22 06:44:12
 */

@Configuration
public class Config {
    @Bean
    public UserService userService() {
        return new UserService(userDao());
    }

    @Bean
    public UserDao userDao() {
        return new UseDaoImpl();
    }
}
