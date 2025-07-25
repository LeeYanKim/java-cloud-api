package com.lee.javacloudapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the Java Cloud API!";
    }
    
    @GetMapping("/api/add")
    public String addNumbers() {
        int result = 2 + 109;
        return "Result: " + result;
    }

    @GetMapping("/api/hello")
    public String sayHello() {
        return "Hello from Java Cloud API!";
    }
}
