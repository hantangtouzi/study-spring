package com.hantangtouzi;

/**
 * @author WilliamChang.
 * Created on 2018/7/6 13:17
 */

public class UserServiceImpl implements UserService {
    @Override
    public User getUserById() {
        User user = new User();
        user.setName("zhangsan");
        user.setPassword("xxxxxx");
        return user;
    }
}
