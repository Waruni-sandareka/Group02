package com.ucsc.groupb.pages;

import org.openqa.selenium.By;

public enum PG_EditProfile {

    //nav_User("//*[@id=\"content\"]/div[2]/nav/ul/li[5]/a/span[2]"),
    nav_User("//span[normalize-space()='John Doe']"),
    nav_EditProfile("//a[ @id='edit_profile']"),

    //-------------------------------------
    nav_EditProfile_2("//a[@class='pull-left submit_button btn btn-primary']"),
    tf_Ep_FirstName("(//input[@id='first_name'])[1]"),
    btn_Ep_Save("(//input[@id='submitf'])[1]"),
    tf_Ep_Email("(//input[@id='email'])[1]"),
    tf_Ep_UserName("//input[@id='username']"),
    Ep_UploadImageBtn("//span[@class='buttonText']");

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
