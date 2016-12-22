package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
    }

    private static List<Integer> generate(int n) {
        ArrayList<Integer> primeFactorList = new ArrayList();
        if(n%2==0)
        {
            primeFactorList.add(2);
        }
        if(n%3==0)
        {
            primeFactorList.add(3);
        }
        if(n%5==0)
        {
            primeFactorList.add(5);
        }
        if(n%7==0)
        {
            primeFactorList.add(7);
        }
        //System.out.println(primeFactorList);
        Collections.sort(primeFactorList);
        return primeFactorList;
    }
}
