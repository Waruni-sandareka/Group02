package com.ucsc.groupb.functions;

import com.ucsc.groupb.pages.*;
import com.ucsc.groupb.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LIB_Common extends TestBase {
    private static LIB_Common instance;

    private LIB_Common() {
    }

    public static LIB_Common get() {
        if (instance == null) {
            synchronized (LIB_Common.class) {
                if (instance == null) {
                    instance = new LIB_Common();
                }
            }
        }
        return instance;
    }

    public void bc_Login(String uname, String pwd) {
        navigateToURL(getURL());
        click(PG_Login.tf_UserName);
        type(PG_Login.tf_UserName, uname);
        click(PG_Login.tf_Password);
        type(PG_Login.tf_Password, pwd);
        click(PG_Login.btn_Login);
    }

    public boolean bc_VerifyDashboard() {
        return isElementDisplayed(PG_Login.dashboardElement);
    }

    public boolean bc_VerifyErrorMessages(String expectedMessage) {
        String actualMessage = getText(PG_Login.errorMessage);
        return actualMessage.equals(expectedMessage);

    }
    //Select location as default
    public void selectLocation() throws InterruptedException {
        // Wait for the element to be clickable using locator
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(PG_Dashboard.tf_location.getLocator())).click();
        Thread.sleep(1000);
    }



    public void navigateToNewCustomer() {
        // Navigate to the Side Navigation and open the Customers dropdown
        click(PG_Navigation.nav_Customers);
        click(PG_Navigation.nav_Customers_Dropdown);
        // Click the New Customer button on the All Customers page
        click(PG_Customers.btn_NewCustomer);
    }

    public void navigateToAddNewCustomerDirect() {
        click(PG_Navigation.header_AddBtn);
        click(PG_Navigation.header_Customers_Dropdown);
    }

    public void verifyFirstNameEmpty() {
        click(PG_NewCustomer.tf_FirstName);
        click(PG_NewCustomer.btn_Save);
    }

    public boolean isDeleteButtonVisible() {
        click(PG_NewCustomer.btn_Add_AdditionalPhoneNo);
        return isElementDisplayed(PG_NewCustomer.btn_Delete);
    }

    //------------------------------------------------------------------
    public static void scroll(int x, int y) {
        Actions actions = new Actions(driver);
        actions.scrollByAmount(x, y);
        //new Actions(driver).actions.scrollByAmount(x,y);
    }

    public void VerifyNonRequiredTextFeildAddress1(String address1) {
        // click(PG_NewCustomer.tf_FirstName);
        //type(PG_NewCustomer.tf_FirstName,fname);
        click(PG_NewCustomer.tf_Address_1);
        type(PG_NewCustomer.tf_Address_1, address1);
        //click(PG_NewCustomer.btn_Save);
    }

    public void VerifyNonRequiredTextFeildAddress2(String address2) {

        click(PG_NewCustomer.tf_Address_2);
        type(PG_NewCustomer.tf_Address_2, address2);
        // click(PG_NewCustomer.btn_Save);

    }

    public void VerifyNonRequiredTextFeildCity(String city) {
        //click(PG_NewCustomer.tf_FirstName);
        //type(PG_NewCustomer.tf_Address_1,fname);
        click(PG_NewCustomer.tf_City);
        type(PG_NewCustomer.tf_City, city);
        //click(PG_NewCustomer.btn_Save);

    }

}
