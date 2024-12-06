package com.example.demo.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name="usuarios")
public class Usuario {

    private String user;
    private String password;
}
