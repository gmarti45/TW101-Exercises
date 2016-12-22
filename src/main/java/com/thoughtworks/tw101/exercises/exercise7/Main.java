package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

public class Main {

    public static void main(String[] args) {

        int number = (int) (Math.random() * (100 - 1)) + 2;
        //System.out.println(number);
        Input i = new Input();
        int guess = i.input();

        while(guess != number){
            Incorrect n = new Incorrect();
            n.incorrect(guess, number);
            guess = i.input();
        }
        if (guess == number)
        {
            Correct c = new Correct();
            c.correct();
        }

    }
}
