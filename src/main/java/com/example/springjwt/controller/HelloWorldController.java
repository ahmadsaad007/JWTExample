package com.example.springjwt.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class HelloWorldController {

    @RequestMapping({ "/hello" })
    public String firstPage() {
        return "login";
    }

    @PostMapping("/hello")
    public String login(HttpServletResponse httpServletResponse, String username, String password,
                        String redirect, Model model){

        if (username == null ) {

            model.addAttribute("error", "Invalid username or password!");
            return "login";
        }
        return "login";
    }

}