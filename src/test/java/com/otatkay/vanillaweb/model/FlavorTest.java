package com.otatkay.vanillaweb.model;

import java.util.Arrays;

import com.otatkay.vanillaweb.model.Flavor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class FlavorTest {

    @Test
    void testGetLabel() {
        for (Flavor currentFlavor : Flavor.values()) {
            assertNotNull( currentFlavor.getLabel());
        }
    }

    @Test
    void testHowDoesItTaste() {
        for (Flavor currentFlavor : Flavor.values()) {
            assertNotNull( currentFlavor.howDoesItTaste() );
        }
    }

}