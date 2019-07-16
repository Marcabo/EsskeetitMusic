package com.herion.esskeetitmusic.dao;

import com.herion.esskeetitmusic.entity.User;

public interface UserDao {
    //登录
    User login(User user);
    //注册
    int addUser(User user);
}
