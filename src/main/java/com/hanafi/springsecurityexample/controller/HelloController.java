package com.hanafi.springsecurityexample.controller;

import jakarta.servlet.http.HttpServletRequest;
//import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello(HttpServletRequest request){
        String id = request.getSession().getId();
//        CsrfToken csrf = (CsrfToken) request.getAttribute("_csrf");
        return "Hello "+ id;
    }


}
