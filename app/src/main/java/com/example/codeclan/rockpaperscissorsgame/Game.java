package com.example.codeclan.rockpaperscissorsgame;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by davinasanders on 29/05/2018.
 */

public class Game {
    ArrayList<String> results;

    public Game() {
//        this.results = ArrayList<String>(Arrays.asList("rock", "paper", "scissors"));
        this.results = new ArrayList<>();
    }

    public void SetUpResults() {
        results.add("rock");
        results.add("paper");
        results.add("scissors");
    }

    public ArrayList<String> getResults(){
        return this.results;
    }

    public String randomResult() {
        this.SetUpResults();
        Collections.shuffle(this.results);
        return this.results.get(0);
    }

    public String gameResult(String buttonResult) {
        if (buttonResult == "rock" && this.randomResult() == "rock") {
            return "This is a draw";
        }
        if (buttonResult == "scissors" && this.randomResult() == "scissors") {
            return "This is a draw";
        }
        if (buttonResult == "paper" && this.randomResult() == "paper") {
            return "This is a draw";
        }
        if (buttonResult == "paper" && this.randomResult() == "rock") {
            return "You have won";
        }
        if (buttonResult == "rock" && this.randomResult() == "scissors") {
            return "You have won";
        }
        if (buttonResult == "scissors" && this.randomResult() == "paper") {
            return "You have won";
        }
        if (buttonResult == "paper" && this.randomResult() == "scissors") {
            return "You have lost";
        }
        if (buttonResult == "scissors" && this.randomResult() == "rock") {
            return "You have lost";
        }
        if (buttonResult == "rock" && this.randomResult() == "paper") {
            return "You have lost";
        }
        else {
            return "o";
        }
    }




}
