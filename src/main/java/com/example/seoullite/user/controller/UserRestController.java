package com.example.seoullite.user.controller;

import com.example.seoullite.common.service.EmailService;
import com.example.seoullite.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @Autowired
    EmailService emailService;

    @PostMapping("/join")
    public String join( User user)throws IOException {

        emailService.sendMail(user.getEmail());
        return "null";
    }
}
