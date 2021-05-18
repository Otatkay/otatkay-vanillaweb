package com.otatkay.vanillaweb.app;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class VanillalizerTest {
    @BeforeAll 
    static void BeforeClass() {
        //loading of properties is needed in any case, even for standalone execution
        VanillApp.start();
    }

    @Test
    void testLoadProperties() {
        assertNotNull("Assert Application name", VanillApp.getAppProperty("app.name"));
        assertNotNull("Assert application locale", VanillApp.getAppProperty("app.locale"));
    }

}