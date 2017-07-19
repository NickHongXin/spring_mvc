package com.nick.dao.impl;

import com.nick.dao.UserDao;
import com.nick.entity.User;
import com.nick.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shx on 2017/07/07.
 */
@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private UserMapper userMapper;

    public long addUser(User user){
        return userMapper.addUser(user);
    }

    public User getUserById (int id){
        return userMapper.getUserById(id);
    }

    public int selectLastInsertId(){
        return userMapper.selectLastInsertId();
    }
}
