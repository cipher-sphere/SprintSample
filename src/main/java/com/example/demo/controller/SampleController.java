package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/Shivam")
    public String getMessage() {
        return "Hi I am from machine of Shivam";
    }
}