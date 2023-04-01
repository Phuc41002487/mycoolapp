package com.love2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // inject properties
    @Value("${mylover.name}")
    private String loverName;

    @Value("${mylover.age}")
    private String loverAge;

    // expose new endpoint for my lover
    @GetMapping("/lover")
    public String getLoverInfo() {
        return "My lover is " + loverName + " and her age is " + loverAge;
    }

    // expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Do some yoga";
    }

    // call my lover
    @GetMapping("/gf")
    public String callMyLover() {
        return "Call Jenny";
    }
}
