package com.example.Point.of.sale.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@GetMapping
public String hello() {
    return "Hello from New Test :)";
}