package com.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index(@RequestParam("id") String id) {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/books/{bookId}")
    public String index1(@PathVariable("bookId") int bookId) {
        return "Greetings from Spring Boot!";
    }

}
