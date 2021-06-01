package com.otatkay.vanillaweb.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Properties;
import java.util.ResourceBundle;

import com.otatkay.vanillaweb.exception.InitializationException;
import com.otatkay.vanillaweb.model.Flavor;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class VanillalizerTest {
    @BeforeAll 
    static void BeforeClass() {
        VanillApp anApp = new VanillApp();
        Vanillalizer anIzer = new Vanillalizer();
        //loading of properties is needed in any case, even for standalone execution
        anApp.start();
    }

    @Test
    void testLoadProperties() {
        Properties appProperties = Vanillalizer.loadAppProperties("/appProperties.properties");
        assertNotNull("Assert Application name",  appProperties.getProperty("app.name"));
        assertNotNull("Assert application locale", appProperties.getProperty("app.locale"));
        assertThrows( InitializationException.class , () -> {Vanillalizer.loadAppProperties("UnknownFile");});

    }

    @Test
    void testLoadFlavors() {
        ResourceBundle flavors = Vanillalizer.loadFlavors(VanillApp.getAppProperty("app.locale"));
        for (Flavor currentFlavor : Flavor.values()) {
            assertEquals( VanillApp.getFlavorLabel(currentFlavor) , flavors.getString(currentFlavor.toString()));
        }
        // same for FR
        ResourceBundle otherFlavors = Vanillalizer.loadFlavors("FR");
        for (Flavor currentFlavor : Flavor.values()) {
            assertTrue(otherFlavors.containsKey(currentFlavor.toString()));
        }
    }
    @Test
    void testLoadNullFlavors() {
           // Test  for NULL ==> defaulted to EN 
        ResourceBundle nullFlavors = Vanillalizer.loadFlavors(null);
        for (Flavor currentFlavor : Flavor.values()) {
            assertEquals( VanillApp.getFlavorLabel(currentFlavor) , nullFlavors.getString(currentFlavor.toString()));
        }
    }
    
    @AfterAll 
    static void AfterClass() {
        //loading of properties is needed in any case, even for standalone execution
        VanillApp.stop();
    }
}