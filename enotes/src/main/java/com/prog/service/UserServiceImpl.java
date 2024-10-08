package com.prog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.entity.User;
import com.prog.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepo;

    @Override
    public User saveUser(User user) {
        user.setRole("ROLE_USER");
        User newUser = userRepo.save(user);
        return newUser;
    }

    @Override
    public boolean existEmailCheck(String email) {
        return userRepo.existsByEmail(email);
    }

    
}
