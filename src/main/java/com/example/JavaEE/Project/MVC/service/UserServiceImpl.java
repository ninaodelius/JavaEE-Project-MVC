package com.example.JavaEE.Project.MVC.service;

import com.example.JavaEE.Project.MVC.entity.User;
import com.example.JavaEE.Project.MVC.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public List<User> listAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    public User saveNewUser(User user){
        return userRepository.save(user);
    }

    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }

    public void updateUserById(Long id, User user){

        User userToUpdate = getUserById(id).orElseThrow(() -> new RuntimeException("id not found - " + id));

        if (user.getName() != null) { userToUpdate.setName(user.getName()); }
        if (user.getEmail() != null) { userToUpdate.setEmail(user.getEmail()); }
        if (user.getPassword() != null) { userToUpdate.setPassword(user.getPassword()); }

        userRepository.save(userToUpdate);

    }
}
