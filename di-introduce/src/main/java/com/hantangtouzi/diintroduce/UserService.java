package com.hantangtouzi.diintroduce;

/**
 * @author WilliamChang.
 * Created on 2019-06-22 06:43:02
 */

public class UserService {
    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void sayHello() {
        userDao.sayHello();
    }
}
