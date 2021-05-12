package com.otatkay.vanillaweb.controler;

import com.otatkay.vanillaweb.model.Flavor;
import com.otatkay.vanillaweb.utils.RandomGenerator;

public class IndexPageControler {
    Flavor pageFlavor;

    public IndexPageControler() {
        setPageFlavor();
    }

    public String whatAreWeTastingNow() {
        return getPageFlavor().getLabel();
    }

    public String howDoesItTaste() {
        return getPageFlavor().howDoesItTaste();
    }

    public String myBestFlavor(){
        return getPreferredFlavor().getLabel();
    }

    private void setPageFlavor() {
        int flavorNum = RandomGenerator.getRandomNumber( Flavor.values().length ) ;
        pageFlavor = Flavor.values()[flavorNum];
    }
    private Flavor getPageFlavor() {
        return pageFlavor;
    }

    private Flavor getPreferredFlavor(){
        return Flavor.VANILLA;
    }
}
