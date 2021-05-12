package com.otatkay.vanillaweb.utils;

import org.apache.logging.log4j.Logger;

public class VanillaLog {

    // Get and Initialize the loggers.
    private static final Logger LOGGER = org.apache.logging.log4j.LogManager.getRootLogger();
 
    public static void trace(String message) {
        LOGGER.trace(message);
    }
    public static void debug(String message) {
        LOGGER.debug(message);
    }
    public static void info(String message) {
        LOGGER.info(message);
    }
    public static void logLine() {
        info(" ------------------------------------------------------ ");
    }
    public static void warning(String message) { LOGGER.warn(message);  }
    public static void warning(String message, Exception e) { LOGGER.warn(message,e);  }
    public static void error(String message) { LOGGER.error(message);  }
    public static void error(String message, Throwable e) { LOGGER.error(message,e);  }
    public static void fatal(String message) { LOGGER.fatal(message);  }
    public static void fatal(String message, Throwable e) { LOGGER.fatal(message,e);  }

}
