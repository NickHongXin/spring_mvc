package com.nick.service.impl;

import com.nick.dao.UserDao;
import com.nick.entity.User;
import com.nick.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by shx on 2017/07/07.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Transactional(rollbackFor=Exception.class)
    public long addUser(User user) throws Exception{
        return userDao.addUser(user);
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
