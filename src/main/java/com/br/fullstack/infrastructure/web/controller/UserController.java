package com.br.fullstack.infrastructure.web.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUsers(){
        return "nice maluco";
    }

    @PostMapping
    public String createUsers(){
        return "criado nice maluco";
    }

}
