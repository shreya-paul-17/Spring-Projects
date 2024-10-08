package com.prog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prog.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

    public boolean existsByEmail(String email);
   
}
