package com.otatkay.vanillaweb.utils;

import java.util.Random;

public class RandomGenerator {
    private static final Random randomizer = new Random();

    public static int getRandomNumber(int upperLimit){
        return randomizer.nextInt(upperLimit);
    }

    public static int getRandomNumber(int lowerLimit, int upperLimit){
        return getRandomNumber(upperLimit-lowerLimit) + lowerLimit;
    }

    public static boolean getRandomBoolean (int trueProbability){
        return trueProbability > getRandomNumber(100);
    }
}