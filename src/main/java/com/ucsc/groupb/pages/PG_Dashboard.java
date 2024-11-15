package com.ucsc.groupb.pages;

import org.openqa.selenium.By;

public enum PG_Dashboard {

    tf_location("//a[contains(@class, 'set_employee_current_location_after_login')]");

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
