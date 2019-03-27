package com.example.mp.controller;

import com.example.mp.model.User;
import com.example.mp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: guoyuting
 * @Date: Created at 2019/3/27 4:21 PM
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public Map getAll() {
        Map<String, Object> map = new HashMap<>();
        List<User> list = userService.findAll();
        map.put("data", list);
        return map;
    }

    @GetMapping(value = "/{id}")
    public Map findById(@PathVariable(value = "id") Long id) {
        Map<String, Object> map = new HashMap<>();
        User user = userService.findById(id);
        map.put("data", user);
        return map;
    }
}
