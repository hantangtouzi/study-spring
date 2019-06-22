package com.hantangtouzi.aopintroduce;

/**
 * @author WilliamChang.
 * Created on 2019-06-22 07:09:00
 */

public class UserDaoImpl implements UserDao {
    @Override
    public void sayHello() {
        System.out.println("Hello World!!!");
    }
}
