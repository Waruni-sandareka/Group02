package com.ucsc.groupb.pages;

import org.openqa.selenium.By;

public enum PG_EditProfile {

    nav_User("//*[@id=\"content\"]/div[2]/nav/ul/li[5]/a/span[2]"),

    nav_EditProfile("//a[ @id='edit_profile']"),

    ep_FirstName("//*[ @id='first_name']");
    private final String location;

    PG_EditProfile( String locator) {
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
