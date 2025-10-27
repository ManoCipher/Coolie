package com.coolie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootPowerHouse {

    @GetMapping("/")
    public String home() {
        return "✅ Coolie Backend is Running Successfully!";
    }
}
