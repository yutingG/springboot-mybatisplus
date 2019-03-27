package com.example.mp.service.impl;

import com.example.mp.mapper.UserMapper;
import com.example.mp.model.User;
import com.example.mp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: guoyuting
 * @Date: Created at 2019/3/27 4:19 PM
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.selectList(null);
    }

    @Override
    public User findById(Long id) {
        return userMapper.selectById(id);
    }
}
