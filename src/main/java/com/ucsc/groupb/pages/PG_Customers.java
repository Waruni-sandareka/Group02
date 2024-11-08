package com.ucsc.groupb.pages;

public enum PG_Customers {
    btn_NewCustomer("//*[@id=\"new-person-btn\"]/span");

    private final String locator;

    PG_Customers(String locator) {
        this.locator = locator;
    }

    @Override
    public String toString() {
        return locator;
    }
}
