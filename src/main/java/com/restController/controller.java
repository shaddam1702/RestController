package com.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping
    public  String welcome(){
        return "Welcome to Cloud Run";
    }
}
