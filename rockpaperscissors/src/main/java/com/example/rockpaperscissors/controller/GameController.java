package com.example.rockpaperscissors.controller;

import com.example.rockpaperscissors.model.Game;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @GetMapping("/play")
    public Game play(@RequestParam String choice) {
        if (choice == null || choice.isEmpty()) {
            throw new IllegalArgumentException("Choice parameter is required");
        }
        return new Game(choice);
    }
}
