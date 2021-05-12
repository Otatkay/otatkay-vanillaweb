package com.otatkay.vanillaweb.model;

import com.otatkay.vanillaweb.app.VanillApp;

public enum Flavor {
    VANILLA,
    CHOCOLATE,
    RASPBERRY,
    PEPPERMINT,
    BLUEBERRY,
    WASABI;

    private final String label;

    public String getLabel() {
        return label;
    }

    Flavor() {
    this.label= VanillApp.getFlavorLabel(this);
    }

    public String howDoesItTaste(){
        switch (this) {
            case VANILLA:
                return "Best Taste Ever!";
            case CHOCOLATE:
            case RASPBERRY:
            case BLUEBERRY:
                return "Sweet !";
            case PEPPERMINT:
                return "Fresh !";
            case WASABI:
                return "So Hot !";     
            default:
                return "Nothing";
        }
    }
}
