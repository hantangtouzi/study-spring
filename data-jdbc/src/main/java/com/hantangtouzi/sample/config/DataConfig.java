package com.hantangtouzi.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * @author WilliamChang.
 * Created on 2018/7/11 3:05
 */

@Configuration
public class DataConfig {
    //@Bean
    //public DruidDataSource dataSource() {
    //    DruidDataSource druidDataSource = new DruidDataSource();
    //    druidDataSource.setDriverClassName("org.h2.Driver");
    //    druidDataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
    //    druidDataSource.setUsername("sa");
    //    druidDataSource.setPassword("");
    //    druidDataSource.setInitialSize(5);
    //    druidDataSource.setMaxActive(10);
    //    return druidDataSource;
    //}

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addScript("classpath:schema.sql").addScript("classpath:test-data.sql").build();
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
}
