package com.hantangtouzi.mvcannotation.dao;

import com.hantangtouzi.mvcannotation.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2019-06-2019/6/29 13:06:17
 */

@Component
public class UserDao {

    public User findUserById(Long id) {
        List<User> users = createUsersDataSource();

        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }

    public List<User> findUsers() {
        return createUsersDataSource();
    }

    private List<User> createUsersDataSource() {
        List<User> users = new ArrayList<>();

        User user1 = new User();
        user1.setId(1L);
        user1.setUsername("zhangsan");
        user1.setPassword("password");
        user1.setEmail("zhangsan@aliyun.com");
        users.add(user1);

        User user2 = new User();
        user2.setId(2L);
        user2.setUsername("lisi");
        user2.setPassword("password");
        user2.setEmail("lisi@aliyun.com");
        users.add(user2);

        User user3 = new User();
        user3.setId(3L);
        user3.setUsername("wangwu");
        user3.setPassword("password");
        user3.setEmail("wangwu@aliyun.com");
        users.add(user3);

        return users;
    }
}
