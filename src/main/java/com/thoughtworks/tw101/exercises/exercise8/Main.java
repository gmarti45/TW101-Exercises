package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int number = (int) (Math.random() * (100 - 1)) + 2;
        //System.out.println(number);
        Input i = new Input();
        int guess = i.input();
        ArrayList<Integer> guessList= new ArrayList();

        while(guess != number){
            Incorrect n = new Incorrect();
            n.incorrect(guess, number);
            guess = i.input();
            guessList.add(guess);
        }
        if (guess == number)
        {
            Correct c = new Correct();
            c.correct();
            for (int index = 0; index < guessList.size(); index++)
            {
                System.out.println(guessList.get(index));
            }
        }
    }
}
