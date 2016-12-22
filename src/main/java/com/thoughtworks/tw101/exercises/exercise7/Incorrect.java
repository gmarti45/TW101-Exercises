package com.thoughtworks.tw101.exercises.exercise7;

public class Incorrect {
    public void incorrect(int guess, int number)
    {
        if (guess < number)
        {
            System.out.println("Your guess is too low");
        }
        else if(guess > number)
        {
            System.out.println("Your guess is too high");
        }
    }
}
