package com.prog.service;

import com.prog.entity.User;

public interface UserService {

    public User saveUser(User user);

    public boolean existEmailCheck(String email);
}
