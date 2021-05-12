package com.otatkay.vanillaweb.controler;

import java.util.Arrays;

import com.otatkay.vanillaweb.model.Flavor;

import org.junit.Assert;
import org.junit.Test;

public class IndexPageControlerTest {
    static IndexPageControler pageController = new IndexPageControler();

    @Test
    public void testMyBestFlavor() {
        Assert.assertEquals(Flavor.VANILLA.getLabel(), pageController.myBestFlavor());
    }

    @Test
    public void testWhatAreWeTastingNow() {
        String pageFlavor = pageController.whatAreWeTastingNow();
        // build a list of the labels
        String[] flavorLabels = new String[Flavor.values().length];
        Arrays.setAll(flavorLabels, (index) -> Flavor.values()[index].getLabel()); 
        Assert.assertTrue(Arrays.asList(flavorLabels).contains(pageFlavor));
    }

    @Test
    public void testHowDoesItTaste() {
        String pageTaste = pageController.howDoesItTaste();
        // build a list of the labels
        String[] flavorTastes = new String[Flavor.values().length];
        Arrays.setAll(flavorTastes, (index) -> Flavor.values()[index].howDoesItTaste()); 
        Assert.assertTrue(Arrays.asList(flavorTastes).contains(pageTaste));
    }
}