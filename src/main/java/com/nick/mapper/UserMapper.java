package com.nick.mapper;

import com.nick.entity.User;

/**
 * Created by shx on 2017/07/07.
 */
public interface UserMapper extends SqlMapper{

    public long addUser(User u);

    public User getUserById(int id);

    public int selectLastInsertId();
}
