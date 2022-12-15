package com.example.JavaEE.Project.MVC.controller;

import com.example.JavaEE.Project.MVC.entity.User;
import com.example.JavaEE.Project.MVC.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping()
    public List<User> listUsers(){
        return userService.listAllUsers();
    }

}
