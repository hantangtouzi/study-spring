package com.hantangtouzi.securityweb.dao;

import com.hantangtouzi.securityweb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2018/7/11 3:35
 */

@Component
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    //
    // @Autowired
    // private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public User getUserById(Long id) {
        return jdbcTemplate.queryForObject("select * from t_user where id = ?", new Object[]{id}, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getLong("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        });
    }

    public List<User> findUsers() {
        return jdbcTemplate.query("select * from t_user", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getLong("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        });
    }
}
