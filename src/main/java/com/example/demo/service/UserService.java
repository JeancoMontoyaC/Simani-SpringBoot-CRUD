package com.example.demo.service;

import com.example.demo.model.Users;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository UserRepository;
        @Autowired
        public UserService(UserRepository UserRepository){
            this.UserRepository=UserRepository;
        }
    public List<Users> getUsers(){
        return this.UserRepository.findAll();
        }


    public void newUser(Users user) {
       UserRepository.save(user);
    }
    public List<Object> countUsersByCountry(){
            return this.UserRepository.countUsersByCountry();
    }
}
