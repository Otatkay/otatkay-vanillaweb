package com.otatkay.vanillaweb.app;

import com.otatkay.vanillaweb.model.Flavor;
import com.otatkay.vanillaweb.utils.VanillaLog;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * Singleton class to host all application like the context, the Universe, the properties, the labels etc.
 * The registry is initialized by the AppManager.
 * Note that this class uses the Jave 8 memory management capabilities and by so does not adopt the
 * "traditional" Singleton pattern.
 * https://fxrobin.developpez.com/tutoriels/java/singleton-patron-conception/
 */
public final class VanillApp {
    static{
        start();
    }

    private static Properties appProperties;
    private static ResourceBundle flavorLabels;

    static void start(){
        logWelcomeMessage();
        appProperties = Vanillalizer.loadAppProperties("/appProperties.properties");
        flavorLabels = Vanillalizer.loadFlavors(getAppProperty("app.locale"));
        endInitializationMessage();
    }
    static void stop(){
        VanillaLog.info("STOPPING APPLICATION");
        VanillaLog.info("Saving Universe");
        VanillaLog.logLine();
    }


    static String getAppProperty(String propertyName) {
        return appProperties.getProperty(propertyName);
    }

    public static String getFlavorLabel(Flavor flavor) {
        return flavorLabels.getString(flavor.toString());
    }

    private static void logWelcomeMessage(){
        VanillaLog.info(" ------------------ VANILLAPP MANAGER ------------------ ");
        VanillaLog.info("Put some Vanilla into your Life");
        VanillaLog.logLine();
    }
    private static void endInitializationMessage(){
        VanillaLog.logLine();
        VanillaLog.info("version : "+ getAppProperty("app.version"));
        VanillaLog.info("language: "+ getAppProperty("app.locale"));
        VanillaLog.logLine();
    }

}
