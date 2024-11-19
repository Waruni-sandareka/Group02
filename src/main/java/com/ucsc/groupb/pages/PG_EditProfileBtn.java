package com.ucsc.groupb.pages;

import org.openqa.selenium.By;

public enum PG_EditProfileBtn {

    nav_User("//*[@id=\"content\"]/div[2]/nav/ul/li[4]/a/span[1]/img"),

    nav_EditProfile("//*[@id=\"edit_profile\"]"),

    ep_EditProfileBtn("//a[@class=\"pull-left submit_button btn btn-primary\"]"),

    epb_FirstName("//input[@id=\"first_name\"]"),

    epb_LastName("//input[@id=\"last_name\"]"),

    epb_Email("//input[@id=\"email\"]"),
    epb_PhoneNumber("//input[@id=\"phone_number\"]"),

    epb_ChooseImageFile("//*[@id=\"employee_form\"]/div[1]/div/div[5]/div/ul/li[1]/div/span/label/span[2]"),
    epb_Address1("//*[@id=\"address_1\"]"),
    epb_Address2("//*[@id=\"address_2\"]"),
    epb_City("//*[@id=\"city\"]"),
    epb_state("//*[@id=\"state\"]"),
    epb_zip("//*[@id=\"zip\"]"),
    epb_Country("//*[@id=\"country\"]"),
    epb_comment("//*[@id=\"comments\"]//*[@id=\"comments\"]"),
    epb_save("//*[@id=\"submitf\"]");

    private final String location;

    PG_EditProfileBtn(String locator) {
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
