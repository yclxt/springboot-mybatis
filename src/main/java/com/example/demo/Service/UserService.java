package com.example.demo.Service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    List<User> getAllUsers();

}
