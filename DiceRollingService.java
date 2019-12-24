package com.company.services;

import java.util.Random;

public class DiceRollingService {

    public int rollDice(){
        return new Random().nextInt(6) + 1;
    }

}
