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
        this.results = new ArrayList<String>();
        results.add("rock");
        results.add("paper");
        results.add("scissors");
        results.add("Lizard");
        results.add("Spock");
    }


    public ArrayList<String> getResults(){
        return this.results;
    }

    public String randomResult() {
        Collections.shuffle(this.results);
        return this.results.get(0);
    }

    public String gameResult(String buttonResult){
        String androidChoice = this.randomResult();
        String message = "You picked: " + buttonResult + ".\nAndroid picked: " + androidChoice;

        if (buttonResult.equals(androidChoice)) {
            return message + ".\nIt is a draw";
        }
        switch (buttonResult) {
            case "rock":
                if (androidChoice.equals("scissors") || androidChoice.equals("lizard")){
                        return message + ".\nYou have won";
                }
                break;

            case "scissors":
                if (androidChoice.equals("paper") || androidChoice.equals("lizard")){
                        return message + ".\nYou have won";
                }
                break;

            case "paper":
                if (androidChoice.equals("rock") || androidChoice.equals("spock")){
                    return message + ".\nYou have won";
                }
                break;

            case "spock":
                if (androidChoice.equals("scissors") || androidChoice.equals("rock")){
                    return message + ".\nYou have won";
                }
                break;

            case "lizard":
                if (androidChoice.equals("spock") || androidChoice.equals("paper")){
                    return message + ".\nYou have won";
                }
                break;
            }

            return message + ".\nYou have lost";
        }


    }




//    public String oldGameResult(String buttonResult) {
//        String androidChoice = this.randomResult();
//        String message = "You picked: " + buttonResult + ".\nAndroid picked: " + androidChoice;
//
//        if (buttonResult == androidChoice) {
//            return message + ".\nIt is a draw";
//        }
//
//        if ((buttonResult == "paper" && androidChoice == "rock") || (buttonResult == "paper" && androidChoice == "spock")) {
//            return message + ".\nYou have won";
//        }
//        if ((buttonResult.equals("rock") && androidChoice.equals("scissors") || (buttonResult == "rock" && androidChoice == "lizard")) {
//            return message + ".\nYou have won";
//        }
//        if ((buttonResult == "scissors" && androidChoice == "paper") || (buttonResult == "scissors" && androidChoice == "lizard")) {
//            return message + ".\nYou have won";
//        }
//        if ((buttonResult == "lizard" && androidChoice == "spock") || (buttonResult == "lizard" && androidChoice == "paper")) {
//            return message + ".\nYou have won";
//        }
//        if ((buttonResult == "spock" && androidChoice == "scissors") || (buttonResult == "spock" && androidChoice == "rock")) {
//            return message + ".\nYou have won";
//        }
//        else {
//            return message + ".\nYou have lost";
//        }




//        if (buttonResult == "paper" && this.randomResult() == "scissors") {
//            System.out.println("You have lost");
//        }
//        if (buttonResult == "scissors" && this.randomResult() == "rock") {
//            System.out.println("You have lost");
//        }
//        if (buttonResult == "rock" && this.randomResult() == "paper") {
//            System.out.println("You have lost");
//        }