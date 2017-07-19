package com.nick.converter;


import com.nick.entity.User;
import com.nick.entity.UserTbl;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by shx on 2017/07/11.
 */
public class UserToUserTbl implements Converter<User, UserTbl>{
    @Override
    public UserTbl convert(User from) {
        UserTbl to = new UserTbl();
        to.setName(from.getName());
        to.setAge(from.getAge());
        to.setPwd(from.getPwd());
        return to;
    }
}
