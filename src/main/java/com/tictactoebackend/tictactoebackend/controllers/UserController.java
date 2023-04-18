package com.tictactoebackend.tictactoebackend.controllers;

import com.tictactoebackend.tictactoebackend.models.User;
import com.tictactoebackend.tictactoebackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }
    @GetMapping("/users")
    List<User> getAllUsers() {
       return userRepository.findAll();
    }
}
