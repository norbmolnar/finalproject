package com.example.rockpaperscissors.model;

import java.util.Random;

public class Game {
    private static final String[] choices = {"rock", "paper", "scissors"};
    private final String userChoice;
    private final String computerChoice;
    private final String winner;

    public Game(String userChoice) {
        this.userChoice = userChoice;
        this.computerChoice = getRandomChoice();
        this.winner = determineWinner(userChoice, computerChoice);
    }

    private String getRandomChoice() {
        Random random = new Random();
        return choices[random.nextInt(choices.length)];
    }

    private String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }
        if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                (userChoice.equals("paper") && computerChoice.equals("rock"))) {
            return "User";
        }
        return "Computer";
    }

    public String getUserChoice() {
        return userChoice;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public String getWinner() {
        return winner;
    }
}
