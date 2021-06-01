package com.otatkay.vanillaweb.utils;

import com.otatkay.vanillaweb.exception.VanillaException;

import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

class VanillaLogTest  {

    @Test
    void testVanillaLog() {
        VanillaLog aLogger = new VanillaLog();
        try {
            aLogger.logLine();
        } catch (Throwable t) {
            fail("Exception during constructor test : "+t.getMessage());
        }
    }

    @Test
    void testLogLine() {
        try {
            VanillaLog.logLine();
        } catch (Throwable t) {
            fail("Exception during Log line test : "+t.getMessage());
        }
    }

    @Test
    void testTrace() {
        try {
            VanillaLog.trace("TRACE test");
        } catch (Throwable t) {
            fail("Exception during TRACE test : "+t.getMessage());
        }
    }

    @Test
    void testDebug() {
        try {
            VanillaLog.debug("debug test");
        } catch (Throwable t) {
            fail("Exception during debug test : "+t.getMessage());
        }
    }

    @Test
    void testInfo() {
        try {
            VanillaLog.info("info test");
        } catch (Throwable t) {
            fail("Exception during info test : "+t.getMessage());
        }
    }

    @Test
    void testWarning() {
        try {
            VanillaLog.warning("warning test");
        } catch (Throwable t) {
            fail("Exception during warning test : "+t.getMessage());
        }
        try {
            VanillaLog.warning("warning test", new VanillaException("Test exception warning Message - No bug"));
        } catch (Throwable t) {
            fail("Exception during warning test : "+t.getMessage());
        }
    }

    @Test
    void testError() {
        try {
            VanillaLog.error("error test", new VanillaException("Test exception error Message - No bug"));
        } catch (Throwable t) {
            fail("Exception during error test : "+t.getMessage());
        }
        try {
            VanillaLog.error("error test");
        } catch (Throwable t) {
            fail("Exception during error test : "+t.getMessage());
        }
    }

    @Test
    void testFatal() {
        try {
            VanillaLog.fatal("fatal test", new VanillaException("Test exception fatal Message - No bug"));
        } catch (Throwable t) {
            fail("Exception during fatal test : "+t.getMessage());
        }
        try {
            VanillaLog.fatal("fatal test");
        } catch (Throwable t) {
            fail("Exception during fatal test : "+t.getMessage());
        }
    }

}