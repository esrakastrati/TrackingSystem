package com.commonSpace.TrackingSystem.domain;


import javax.persistence.*;

@Entity
@Table(name="login")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

   
}