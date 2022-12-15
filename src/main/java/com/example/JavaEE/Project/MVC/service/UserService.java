package com.example.JavaEE.Project.MVC.service;

import com.example.JavaEE.Project.MVC.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> listAllUsers();

    User saveNewUser(User user);

    void deleteUserById(Long id);

    void updateUserById(Long id, User user);

    Optional<User> getUserById(Long id);
}
