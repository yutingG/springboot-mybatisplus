package com.example.mp.service;

import com.example.mp.model.User;

import java.util.List;

/**
 * @Author: guoyuting
 * @Date: Created at 2019/3/27 4:18 PM
 */
public interface UserService {
    List<User> findAll();

    User findById(Long id);
}
