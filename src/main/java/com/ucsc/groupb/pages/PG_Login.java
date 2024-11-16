package com.ucsc.groupb.pages;

public enum PG_Login {
    tf_UserName("#username"),
    tf_Password("#password"),
    btn_Login("//button[text()='Login']"),
    errorMessage(".error"),
    dashboardElement("//span[@class='text' and text()='Dashboard']");

    private final String locator;

    PG_Login(String locator) {
        this.locator = locator;
    }

    @Override
    public String toString() {
        return locator;
    }
}

