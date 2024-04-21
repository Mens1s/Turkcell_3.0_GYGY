package com.turkcell.authservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @GetMapping
    public String get(){
        return "HELLOWOWOWOWO";
    }

    @PostMapping
    public String post(){
        return "Hello Admin!";
    }
}