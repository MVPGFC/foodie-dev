package com.gfc.service.impl;

import com.gfc.mapper.UsersMapper;
import com.gfc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean usernameIsExist(String username) {
        return false;
    }
    //
//    @Autowired
//    public UsersMapper usersMapper;
//
//    @Override
//    public boolean usernameIsExist(String username) {
//        usersMapper.selectOneByExample(username);
//
//    }
}
