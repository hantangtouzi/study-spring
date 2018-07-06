package com.hantangtouzi;

import org.springframework.stereotype.Component;

/**
 * @author WilliamChang.
 * Created on 2018/7/6 13:17
 */

@Component
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById() {
        User user = new User();
        user.setName("zhangsan");
        user.setPassword("xxxxxx");
        return user;
    }
}
