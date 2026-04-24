package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    
    @GetMapping("/garima")
    public String getMessage1() {
        return "Hi I am from machine garima ";

    }
    
}