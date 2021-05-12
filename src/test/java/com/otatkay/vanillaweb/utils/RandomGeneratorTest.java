package com.otatkay.vanillaweb.utils;

import org.junit.Assert;
import org.junit.Test;

public class RandomGeneratorTest {

    @Test
    public void testGetRandomNumber() {
        int randomNumber = RandomGenerator.getRandomNumber(10);
        Assert.assertTrue("Random Number should be positive", -1<randomNumber);
        Assert.assertTrue("Random number should be less than limit", 10>randomNumber);
    }

    @Test
    public void testGetRandomNumberWithLimits() {
        int randomNumber = RandomGenerator.getRandomNumber(5,10);
        Assert.assertTrue("Random Number should be greater than lower limit", 5<randomNumber);
        Assert.assertTrue("Random number should be less than upper limit", 10>randomNumber);
    }

    @Test
    public void testGetRandomBoolean() {
        Assert.assertFalse("Random bolean should be always False with a proba of 0", RandomGenerator.getRandomBoolean(0));
        Assert.assertTrue("Random bolean should be always True with a proba of 100", RandomGenerator.getRandomBoolean(100));
    }
}