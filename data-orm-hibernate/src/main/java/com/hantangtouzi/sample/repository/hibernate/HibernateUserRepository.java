package com.hantangtouzi.sample.repository.hibernate;

import com.hantangtouzi.sample.entity.User;
import com.hantangtouzi.sample.repository.UserRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2018/7/11 16:13
 */

@Repository
public class HibernateUserRepository implements UserRepository {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User getUserById(Long id) {
        return sessionFactory.getCurrentSession().get(User.class, id);
    }

    @Override
    public List<User> findUsers() {
        return null;
    }

    @Override
    public User saveUser(User user) {
        Serializable id = sessionFactory.getCurrentSession().save(user);
        return new User((Long) id, user.getUsername(), user.getPassword());
    }
}
