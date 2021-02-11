package com.daovantam.shop.controller;

import com.daovantam.shop.model.entities.User;
import com.daovantam.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<Void> save(@RequestBody User user) {
        userService.save(user);
        return ResponseEntity.ok().build();
    }
}
