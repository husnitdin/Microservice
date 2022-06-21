package com.example.demo1.controller;

import com.example.demo1.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/demo1")
    public String demo1(){
        return "Hello from demo 1"+service.callDemo2().toString();
    }
}
