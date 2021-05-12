package com.otatkay.vanillaweb.app;

import org.junit.Assert;
import org.junit.Test;
import org.junit.BeforeClass;

public class VanillalizerTest  {
    @BeforeClass 
    public static void BeforeClass() {
        //loading of properties is needed in any case, even for standalone execution
        VanillApp.start();
    }

    @Test
    public void testLoadProperties() {
        Assert.assertNotNull("Assert Application name", VanillApp.getAppProperty("app.name"));
        Assert.assertNotNull("Assert application locale", VanillApp.getAppProperty("app.locale"));
    }

}