package com.example.gogo.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping(value = "/login")
    public String doLogin(){
        System.out.println("로그인 페이지 실행");
        return "login";
    }
}