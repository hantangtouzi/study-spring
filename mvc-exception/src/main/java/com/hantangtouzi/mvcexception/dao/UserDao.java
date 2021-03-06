package com.hantangtouzi.mvcexception.dao;

import com.hantangtouzi.mvcexception.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WilliamChang.
 * Created on 2018/7/11 3:35
 */

@Component
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public User getUserById(Long id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        return jdbcTemplate.queryForObject("select * from t_user where id = ?", new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                System.out.println("rs=" + rs);
                if (rs == null) {
                    return null;
                }
                User user = new User();
                user.setId(rs.getLong("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        }, id);
    }

    // public User getUserById(Long id) {
    //     Map<String, Object> map = new HashMap<>();
    //     map.put("id", id);
    //     return namedParameterJdbcTemplate.queryForObject("select * from t_user where id = :id", map, new RowMapper<User>() {
    //         @Override
    //         public User mapRow(ResultSet rs, int rowNum) throws SQLException {
    //             User user = new User();
    //             user.setId(rs.getLong("id"));
    //             user.setUsername(rs.getString("username"));
    //             user.setPassword(rs.getString("password"));
    //             return user;
    //         }
    //     });
    // }

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
