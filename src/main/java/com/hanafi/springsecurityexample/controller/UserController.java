package com.hanafi.springsecurityexample.controller;

import com.hanafi.springsecurityexample.model.Users;
import com.hanafi.springsecurityexample.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@AllArgsConstructor
public class UserController {


    @Autowired
    private UserService userService;

    private BCryptPasswordEncoder passwordEncoder =new BCryptPasswordEncoder(12);

    @GetMapping("users")
    public List<Users> names(){
        return userService.getAllUsers();
    }

    @PostMapping("users")
    public Users addUser(@RequestBody Users users){
        users.setPassword(passwordEncoder.encode(users.getPassword()));
        return userService.addUser(users);
    }

    @DeleteMapping("users/{id}")
    public String deleteUser(@PathVariable int id){
        userService.deleteUser(id);
        return "Deleted";
    }
}
