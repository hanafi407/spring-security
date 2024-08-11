package com.hanafi.springsecurityexample.service;

import com.hanafi.springsecurityexample.model.UserPrincipal;
import com.hanafi.springsecurityexample.model.Users;
import com.hanafi.springsecurityexample.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@AllArgsConstructor
public class MyUserDetails implements UserDetailsService {
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepo.findByUsername(username);
        if(user==null){
            System.out.println("User is not found.");
            throw new UsernameNotFoundException("Username is not found");
        }

        return new UserPrincipal(user);

    }
}
