package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    int hitPoints = 0;
    boolean dead = false;

    @Override
    public boolean takeDamage(int amount) {
        hitPoints = hitPoints + amount;
        if (hitPoints == 20) {
            dead = true; //All monsters damaged
        }
        return dead;


    }

    @Override
    public void reportStatus() {
        System.out.println("Orc has " + hitPoints + " hit points");
    }
}