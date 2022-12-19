package com.example.JavaEE.Project.MVC.config;

import com.example.JavaEE.Project.MVC.entity.User;
import com.example.JavaEE.Project.MVC.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class InitialDataConfig {
    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return args -> {
            User user1 = new User("test1@email.com", "name1", "password");
            User user2 = new User("test2@gmail.com", "name2", "password");
            userRepository.saveAll(List.of(user1,user2));
        };
    }
}