package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
//@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add")
    public int addUser(User user){
        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/all", produces = {"application/json;charset=UTF-8"})
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

//    @RequestMapping(value = "/index")
//    public String index(){
//        return "hello spring boot！！！";
//    }
}
