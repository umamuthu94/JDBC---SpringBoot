package com.tbp.springbootjdbc.repository;

import java.util.List;

import com.tbp.springbootjdbc.model.User;

public interface UserRepository {
    User saveUser(User user);
    User updateUser(User user);
    User getById(int id);
    String deleteById(int id);
    List<User> allUsers();
}
