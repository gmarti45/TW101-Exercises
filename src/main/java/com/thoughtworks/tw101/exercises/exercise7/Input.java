package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;

public class Input {

    public int input(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number between 1 and 100: ");
        String sGuess = scanner.next();
        int guess = Integer.parseInt(sGuess);
        return guess;
    }


}

