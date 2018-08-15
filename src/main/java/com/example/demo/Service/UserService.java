package com.example.demo.Service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    User findUserById(Integer Id);

    List<User> getAllUsers();

    int updateUser(User user);

    int deleteUserById(Integer Id);

}
