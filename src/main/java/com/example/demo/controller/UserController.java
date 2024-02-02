package com.example.demo.controller;

import com.example.demo.model.Users;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="user")
public class UserController {
    private final UserService userservice;

    @Autowired
    public UserController(UserService userservice){
        this.userservice=userservice;
    }

    @GetMapping("/users")
    public List<Users> getUsers(){
        return this.userservice.getUsers();
    }

    @PostMapping("/new")
    public void registrarUser(@RequestBody Users user){
        this.userservice.newUser(user);

    }
    @GetMapping("/country")
    public List<Object> countUsersByCountry(){
        return this.userservice.countUsersByCountry();
    }

}
