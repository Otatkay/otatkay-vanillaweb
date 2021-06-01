package com.otatkay.vanillaweb.app;

import com.otatkay.vanillaweb.exception.InitializationException;
import com.otatkay.vanillaweb.utils.VanillaLog;

import java.io.*;
import java.util.*;

/**
 * Class to do all the App Management: loading of properties, initialization of contacts, singletons if needed etc.
 */

public final class Vanillalizer {

    private static final Locale[] locales = {Locale.US,Locale.FRANCE};

    static Properties loadAppProperties(String propertyFileName){
        Properties loadedProperties = new Properties();
        try{
            VanillaLog.info("Loading property file: " + propertyFileName);
            InputStream appPropertyFile = Vanillalizer.class.getResourceAsStream (propertyFileName);
            loadedProperties.load(appPropertyFile);
            appPropertyFile.close();
        }
        catch (IOException ioe) {
            throw new InitializationException("Error when reading:" + propertyFileName, ioe);
        } catch (Exception e) {
            throw new InitializationException("Ressource not found:" + propertyFileName, e);
        } 
        return loadedProperties;
    }

    static ResourceBundle loadFlavors(String localeProp){
        VanillaLog.info("Loading Internationalization Content");
        int locale;
        try {
            switch (localeProp) {
                case "FR":
                    locale = 1;
                    break;
                case "EN":
                default:
                    locale = 0;
                    break;
            }
        } catch (NullPointerException e) {
            VanillaLog.warning("Locale not defined in Application properties - Using Default Locale");
            locale = 0;
        }
        VanillaLog.info("Locale defined to :"+locales[locale].getCountry());
        return ResourceBundle.getBundle("Flavors", locales[locale]);
    }

}
