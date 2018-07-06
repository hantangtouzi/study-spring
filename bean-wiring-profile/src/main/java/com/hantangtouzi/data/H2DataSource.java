package com.hantangtouzi.data;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author WilliamChang created on 2018/7/6 2:16.
 */

@Component
@Profile("dev")
public class H2DataSource implements DataSource {
    public String getConnection() {
        return "this is an Connection from h2";
    }
}
