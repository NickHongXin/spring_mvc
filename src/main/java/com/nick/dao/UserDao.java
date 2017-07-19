package com.nick.dao;

import com.nick.entity.User;

/**
 * Created by shx on 2017/07/07.
 */
public interface UserDao {

    long addUser(User user);

    User getUserById(int Id);

    int selectLastInsertId();
}
