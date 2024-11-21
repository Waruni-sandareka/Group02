package com.ucsc.groupb.pages;

public enum PG_NewCustomer {
    tf_FirstName("//*[@id=\"first_name\"]"),
    btn_Save("//*[@id=\"submitf\"]"),
    btn_Add_AdditionalPhoneNo("//*[@id=\"add-phone-number-btn\"]"),
    btn_Delete("//*[@id=\"additional-phone-numbers-container\"]/div/div/div/button"),

    tf_Address_1("//input[@id='address_1']"),
    tf_Address_2("//input[@id='address_2']"),
    tf_City("//input[@id='city']");


    private final String locator;

    PG_NewCustomer(String locator) {
        this.locator = locator;
    }

    @Override
    public String toString() {
        return locator;
    }
}
