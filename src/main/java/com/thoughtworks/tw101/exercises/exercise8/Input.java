package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

public class Input {
    public int input(){
        int guess;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number between 1 and 100: ");
        String sGuess = scanner.next();
        try{
            guess = Integer.parseInt(sGuess);
    }
        catch (NumberFormatException e)
        {
            System.out.println("Your guess is not valid. Please enter an integer between 1 and 100");
            guess = input();
        }
        return guess;
    }
}
