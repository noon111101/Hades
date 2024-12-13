package com.example.centralize.controllers;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {

    @Operation(summary = "Get a default greeting")
    @GetMapping
    public String getGreeting() {
        return "Hello, World!";
    }

    @Operation(summary = "Get a personalized greeting")
    @PostMapping
    public String postGreeting(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
}
