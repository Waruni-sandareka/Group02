package com.ucsc.groupb.pages;

import org.openqa.selenium.By;

public enum PG_Dashboard {

    tf_location("//*[@id=\"choose_location_modal\"]/div/div/div[2]/ul/li[1]/a");

    private final String location;

    PG_Dashboard( String locator) {
        this.location = locator;

    }
    public By getLocator() {
        return By.xpath(location);
    }


    @Override
    public String toString() {
        return location;
    }
}
