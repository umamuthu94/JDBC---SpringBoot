package com.tbp.springbootjdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tbp.springbootjdbc.model.User;
import com.tbp.springbootjdbc.repository.UserRepository;

@RestController
public class UserController {
   @Autowired
    UserRepository userRepository;

    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return userRepository.saveUser(user);
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return userRepository.updateUser(user);
    }

    @GetMapping("/user/{id}")
    public User getUser(int id){
        return userRepository.getById(id);
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.allUsers();
    }
}
