package com.otatkay.vanillaweb.controler;

import java.util.Arrays;

import com.otatkay.vanillaweb.model.Flavor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class IndexPageControlerTest {
    static IndexPageControler pageController = new IndexPageControler();

    @Test
    void testMyBestFlavor() {
        assertEquals(Flavor.VANILLA.getLabel(), pageController.myBestFlavor());
    }

    @Test
    void testWhatAreWeTastingNow() {
        String pageFlavor = pageController.whatAreWeTastingNow();
        // build a list of the labels
        String[] flavorLabels = new String[Flavor.values().length];
        Arrays.setAll(flavorLabels, (index) -> Flavor.values()[index].getLabel()); 
        assertTrue(Arrays.asList(flavorLabels).contains(pageFlavor));
    }

    @Test
    void testHowDoesItTaste() {
        String pageTaste = pageController.howDoesItTaste();
        // build a list of the labels
        String[] flavorTastes = new String[Flavor.values().length];
        Arrays.setAll(flavorTastes, (index) -> Flavor.values()[index].howDoesItTaste()); 
        assertTrue(Arrays.asList(flavorTastes).contains(pageTaste));
    }
}