package com.example.JavaEE.Project.MVC.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String email;

    @Column
    private String name;

    @Column
    private String password;

    public User(String email, String name, String password){
    this.email = email;
    this.name = name;
    this.password = password;
    }

}
