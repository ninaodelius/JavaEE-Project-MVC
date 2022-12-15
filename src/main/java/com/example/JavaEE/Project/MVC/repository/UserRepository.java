package com.example.JavaEE.Project.MVC.repository;

import com.example.JavaEE.Project.MVC.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
