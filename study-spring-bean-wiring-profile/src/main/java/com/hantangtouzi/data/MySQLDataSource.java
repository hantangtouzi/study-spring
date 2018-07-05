package com.hantangtouzi.data;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author WilliamChang created on 2018/7/6 1:59.
 */

@Component
@Profile("product")
public class MySQLDataSource implements DataSource {
    public String getConnection() {
        return "this is an Connection from mysql";
    }
}
