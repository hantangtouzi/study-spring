package com.hantangtouzi.dataormhibernate.repository.hibernate;

import com.hantangtouzi.dataormhibernate.entity.User;

import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2018/7/11 16:11
 */

public interface UserRepository {
    User getUserById(Long id);

    List<User> findUsers();

    User saveUser(User user);
}
