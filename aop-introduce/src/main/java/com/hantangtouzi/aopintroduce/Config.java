package com.hantangtouzi.aopintroduce;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author WilliamChang.
 * Created on 2019-06-22 07:05:38
 */

@Configuration
@EnableAspectJAutoProxy
public class Config {
    @Bean
    public UserDao userDao() {
        return new UserDaoImpl();
    }

    @Bean
    public PerformanceAspect performance() {
        return new PerformanceAspect();
    }
}
