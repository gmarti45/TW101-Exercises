package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster{
    int hitPoints = 0;

    boolean dead = false;
    @Override
    public boolean takeDamage(int amount) {
        hitPoints = hitPoints + (amount/2);
        if(hitPoints== 40)
        {
            dead = true; //All monsters damaged
        }
        return dead;
    }

    @Override
    public void reportStatus() {
        System.out.println("Troll has "+ hitPoints + " hit points");

    }
}
