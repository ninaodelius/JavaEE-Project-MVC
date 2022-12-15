package com.example.JavaEE.Project.MVC.service;

import com.example.JavaEE.Project.MVC.entity.User;
import com.example.JavaEE.Project.MVC.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public List<User> listAllUsers() {
        return userRepository.findAll();
    }
}
