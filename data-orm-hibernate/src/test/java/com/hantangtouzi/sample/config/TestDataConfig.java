package com.hantangtouzi.sample.config;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author WilliamChang.
 * Created on 2018/7/11 16:30
 */

@Configuration
@EnableTransactionManagement
@ComponentScan("com.hantangtouzi.sample")
public class TestDataConfig {

    @Bean
    public DataSource dataSource() {
        EmbeddedDatabaseBuilder embeddedDatabaseBuilder = new EmbeddedDatabaseBuilder();
        embeddedDatabaseBuilder.setType(EmbeddedDatabaseType.H2);
        embeddedDatabaseBuilder.addScript("classpath:db/h2/schema.sql");
        embeddedDatabaseBuilder.addScript("classpath:db/h2/test-data.sql");
        return embeddedDatabaseBuilder.build();
    }

    @Bean
    public SessionFactory sessionFactory() throws Exception {
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(dataSource());
        localSessionFactoryBean.setPackagesToScan("com.hantangtouzi.sample.entity");
        Properties properties = new Properties();
        properties.setProperty("dialect", "org.hibernate.dialect.H2Dialect");
        localSessionFactoryBean.setHibernateProperties(properties);
        localSessionFactoryBean.afterPropertiesSet();
        return localSessionFactoryBean.getObject();
    }

    @Bean
    public PlatformTransactionManager transactionManager() throws Exception {
        HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory(sessionFactory());
        return hibernateTransactionManager;
    }
}
