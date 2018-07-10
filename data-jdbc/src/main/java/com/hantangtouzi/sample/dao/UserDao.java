package com.hantangtouzi.sample.dao;

import com.hantangtouzi.sample.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author WilliamChang.
 * Created on 2018/7/11 3:35
 */

@Component
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User getUserById(Long id) {
        return jdbcTemplate.queryForObject("select * from t_user where id = ?", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getLong("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        }, id);
    }
}
