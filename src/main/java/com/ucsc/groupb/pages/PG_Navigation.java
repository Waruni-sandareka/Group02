package com.ucsc.groupb.pages;

public enum PG_Navigation {
    nav_Customers("//*[@id=\"mainMenu\"]/li[3]/a"),
    nav_Customers_Dropdown("//*[@id=\"mainMenu\"]/li[3]/ul/li[1]/a"),
    header_AddBtn("//*[@id=\"content\"]/div[2]/nav/ul/li[1]/a"),
    header_Customers_Dropdown("//*[@id=\"content\"]/div[2]/nav/ul/li[1]/ul/li[4]");

    private final String locator;

    PG_Navigation(String locator) {
        this.locator = locator;
    }

    @Override
    public String toString() {
        return locator;
    }
}
