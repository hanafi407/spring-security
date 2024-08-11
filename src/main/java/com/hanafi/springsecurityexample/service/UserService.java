package com.hanafi.springsecurityexample.service;

import com.hanafi.springsecurityexample.model.Users;
import com.hanafi.springsecurityexample.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepo userRepo;

    public List<Users> getAllUsers(){
        return userRepo.findAll();
    }

    public Users addUser(Users users){
        userRepo.save(users);
        return users;
    }

    public void deleteUser(int id) {
        userRepo.deleteById(id);
    }
}
