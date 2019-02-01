package com.hantangtouzi.datajdbc.dao;

import com.hantangtouzi.datajdbc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author WilliamChang.
 * Created on 2018/7/11 3:35
 */

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public User getUserById(Long id) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        return namedParameterJdbcTemplate.queryForObject("select * from t_user where id = :id", map, new UserRowMapper());
    }

    public List<User> findUsers() {
        return jdbcTemplate.query("select * from t_user", new UserRowMapper());
    }

    public void addUser(User user) {
        jdbcTemplate.update("insert into t_user(id, username, password) values (?, ? , ?)", user.getId(), user.getUsername(), user.getPassword());
    }

    public void deleteUserById(Long userId) {
        jdbcTemplate.update("delete from t_user where id = ?", userId);
    }

    public void updateUser(User user) {
        jdbcTemplate.update("update t_user set username = ?, password = ? where id = ?", user.getUsername(), user.getPassword(), user.getId());
    }

    private class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            return user;
        }
    }

}
