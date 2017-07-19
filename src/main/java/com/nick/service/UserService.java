package com.nick.service;

import com.nick.entity.User;

/**
 * Created by shx on 2017/07/07.
 */
public interface UserService {
    long addUser(User user) throws Exception;

    User getUserById(int id);
}
