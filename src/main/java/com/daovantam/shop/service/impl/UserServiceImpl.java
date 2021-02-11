package com.daovantam.shop.service.impl;

import com.daovantam.shop.model.entities.User;
import com.daovantam.shop.repositories.UserRepository;
import com.daovantam.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
