package com.hantangtouzi;

import com.hantangtouzi.config.ApplicationConfig;
import com.hantangtouzi.data.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author WilliamChang created on 2018/7/6 2:05.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
@ActiveProfiles("dev")
public class ConnectionTest {
    @Autowired
    private DataSource dataSource;

    @Test
    public void testGetConnection() {
        String dataBaseType = dataSource.getConnection();
        System.out.println(dataBaseType);
    }
}
