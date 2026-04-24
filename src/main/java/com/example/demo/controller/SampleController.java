package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    @GetMapping("/Shivam")
    public String getMessage() {
        return "Hi I am from machine of Shivam";
=======
    @GetMapping("/person1")
    public String getMessage() {
        return "Hi I am from machine of person 1";
    }
    @GetMapping("/person2")
    public String getMessage1() {
        return "Hi I am from machine of person 2";
>>>>>>> origin/shruti
=======
    @GetMapping("/vinayak")
    public String getMessage() {
        return "Hi I am from machine of vinayak";
>>>>>>> origin/vinayak-branch
=======

    
    @GetMapping("/garima")
    public String getMessage1() {
        return "Hi I am from machine garima ";

>>>>>>> origin/garima
    }
    
}