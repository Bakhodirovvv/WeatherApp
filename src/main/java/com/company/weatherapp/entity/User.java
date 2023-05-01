package com.company.weatherapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    //    @Column(nullable = false)
//    private String email;
//    private String emailCode;
    @Enumerated(value = EnumType.STRING)
    private Role role;
    @OneToMany
    private List<City> cities;
}

enum Role {
    ADMIN, USER
}