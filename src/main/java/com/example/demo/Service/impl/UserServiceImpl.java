package com.example.demo.Service.impl;

import com.example.demo.Service.UserService;
import com.example.demo.entity.User;
import com.example.demo.entityMapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.selectAllUsers();
    }
}
