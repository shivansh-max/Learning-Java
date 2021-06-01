package com.company;

//import java.util.Scanner;

public class meathodChallenge {

    public static void main(String[] args) {
        String person1 = "Bob";
        String person2 = "James";
        String person3 = "Jeff";
        String person4 = "Lang";
        int defaultScore;

        defaultScore = calculateHighScorePosition(1000);
        displayHighScorePosition(person1, defaultScore);

        defaultScore = calculateHighScorePosition(500);
        displayHighScorePosition(person2, defaultScore);

        defaultScore = calculateHighScorePosition(100);
        displayHighScorePosition(person3, defaultScore);

        defaultScore = calculateHighScorePosition(65);
        displayHighScorePosition(person4, defaultScore);

    }

    public static void displayHighScorePosition(String name, int playerPositionInHighScoreTable) {
        System.out.println(name + " managed to get the position " + playerPositionInHighScoreTable + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        int pos = 0;
        if (score >= 1000) {
            pos = 1;
        } else if (score >= 500 && score < 1000) {
            pos = 2;
        } else if (score >= 100 && score < 500) {
            pos = 3;
        }else if(score < 50 && score > 100){
            pos = 4;
        } else {
            pos = 5;
        }

        return pos;
    }

}