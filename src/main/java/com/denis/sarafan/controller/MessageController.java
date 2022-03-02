package com.denis.sarafan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mesage")
public class MessageController {
    @GetMapping
    public String list(){
        return "index";
    }
}
