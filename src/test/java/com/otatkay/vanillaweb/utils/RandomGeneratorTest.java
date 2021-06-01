package com.otatkay.vanillaweb.utils;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class RandomGeneratorTest {

    @Test
    void testRandomGenerator() {
        RandomGenerator aRandom = new RandomGenerator();
        int randomNumber = aRandom.getRandomNumber(10);
        assertTrue(-1<randomNumber , "Random Number should be positive or equals to 0");
        assertTrue(10>randomNumber , "Random number should be less than limit");
    }

    @Test
    void testGetRandomNumber() {
        int randomNumber = RandomGenerator.getRandomNumber(10);
        assertTrue(-1<randomNumber , "Random Number should be positive or equals to 0");
        assertTrue(10>randomNumber , "Random number should be less than limit");
    }

    @Test
    void testGetRandomNumberWithLimits() {
        int randomNumber = RandomGenerator.getRandomNumber(5,10);
        assertTrue(4<randomNumber , "Random Number should be greater or equal to lower limit");
        assertTrue(10>randomNumber ,"Random number should be less than upper limit");
    }

    @Test
    void testGetRandomBoolean() {
        assertFalse(RandomGenerator.getRandomBoolean(0)  , "Random bolean should be always False with a proba of 0");
        assertTrue( RandomGenerator.getRandomBoolean(100),"Random bolean should be always True with a proba of 100");
    }
}