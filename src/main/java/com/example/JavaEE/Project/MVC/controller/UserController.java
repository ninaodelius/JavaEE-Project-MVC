package com.example.JavaEE.Project.MVC.controller;

import com.example.JavaEE.Project.MVC.entity.User;
import com.example.JavaEE.Project.MVC.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping()
    public List<User> listAllUsers(){
        return userService.listAllUsers();
    }

    @GetMapping("{id}")
    public Optional<User> getUserById(@PathVariable("id")Long id){
    return userService.getUserById(id);
    }

    @PostMapping()
    public User saveNewUser(User user){
        return userService.saveNewUser(user);
    }

    @DeleteMapping("{id}")
    public void deleteUserById(@PathVariable("id")Long id){
        userService.deleteUserById(id);
    }

    @PutMapping("{id}")
    public void updateUserById(@PathVariable("id")Long id,@RequestBody User user){
        userService.updateUserById(id,user);
    }
}
