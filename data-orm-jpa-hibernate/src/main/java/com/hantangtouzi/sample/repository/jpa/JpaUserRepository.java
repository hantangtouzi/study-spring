package com.hantangtouzi.sample.repository.jpa;

import com.hantangtouzi.sample.entity.User;
import com.hantangtouzi.sample.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;
import java.util.List;

/**
 * @author WilliamChang.
 * Created on 2018/7/11 20:41
 */

@Repository
@Transactional
public class JpaUserRepository implements UserRepository {
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Override
    public User getUserById(Long id) {
        return entityManagerFactory.createEntityManager().find(User.class, id);
    }

    @Override
    public List<User> findUsers() {
        return (List<User>) entityManagerFactory.createEntityManager().createQuery("select u from t_user u").getResultList();
    }

    @Override
    public User saveUser(User user) {
        return entityManagerFactory.createEntityManager().merge(user);
    }
}
