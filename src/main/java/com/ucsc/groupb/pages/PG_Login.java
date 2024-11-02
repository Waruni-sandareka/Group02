package com.ucsc.groupb.pages;

public enum PG_Login {
    tf_UserName(""),
    tf_Password("");
    private final String locator;


    PG_Login(String locator) {
        this.locator = locator;
    }

    @Override
    public String toString() {
        return locator;
    }
}
