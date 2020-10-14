package com.ejercicio.javamysqldocker.service.impl;

import com.ejercicio.javamysqldocker.model.User;
import com.ejercicio.javamysqldocker.repository.UserRepository;
import com.ejercicio.javamysqldocker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
