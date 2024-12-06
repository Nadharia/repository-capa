package com.example.demo.Dao;

import com.example.demo.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;



@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Usuario,Long> {
}
