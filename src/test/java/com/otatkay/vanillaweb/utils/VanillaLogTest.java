package com.otatkay.vanillaweb.utils;

import com.otatkay.vanillaweb.exception.VanillaException;

import org.junit.Assert;
import org.junit.Test;

public class VanillaLogTest  {

    @Test
    public void testTrace() {
        try {
            VanillaLog.trace("TRACE test");
        } catch (Throwable t) {
            Assert.fail("Exception during TRACE test : "+t.getMessage());
        }
    }

    @Test
    public void testDebug() {
        try {
            VanillaLog.debug("debug test");
        } catch (Throwable t) {
            Assert.fail("Exception during debug test : "+t.getMessage());
        }
    }

    @Test
    public void testInfo() {
        try {
            VanillaLog.info("info test");
        } catch (Throwable t) {
            Assert.fail("Exception during info test : "+t.getMessage());
        }
    }

    @Test
    public void testWarning() {
        try {
            VanillaLog.warning("warning test");
        } catch (Throwable t) {
            Assert.fail("Exception during warning test : "+t.getMessage());
        }
    }

    @Test
    public void testError() {
        try {
            VanillaLog.error("error test", new VanillaException("Test exception error Message - No bug"));
        } catch (Throwable t) {
            Assert.fail("Exception during error test : "+t.getMessage());
        }
    }

    @Test
    public void testFatal() {
        try {
            VanillaLog.fatal("fatal test", new VanillaException("Test exception fatal Message - No bug"));
        } catch (Throwable t) {
            Assert.fail("Exception during fatal test : "+t.getMessage());
        }
    }

}