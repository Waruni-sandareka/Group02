package com.ucsc.groupb.functions;

import com.ucsc.groupb.pages.*;
import com.ucsc.groupb.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
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
    public void selectLocation() {
        // Handles scenarios with or without the location pop-up using a try-catch block is implemented
        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            // Check if the location element is present and clickable
            WebElement locationElement = wait.until(ExpectedConditions.presenceOfElementLocated(PG_Dashboard.tf_location.getLocator()));

            if (locationElement.isDisplayed()) {
                wait.until(ExpectedConditions.elementToBeClickable(locationElement)).click();
                System.out.println("Location pop-up appeared and was handled.");
            } else {
                System.out.println("Location pop-up not visible.");
            }
        } catch (TimeoutException e) {

            System.out.println("Location pop-up did not appear within the wait time.");
        }
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

    //.............................................................................

    //Edit Profile
    public void NavigateToUser(){
        click(PG_EditProfileBtn.nav_User);
        click(PG_EditProfileBtn.nav_EditProfile);

    }



    public void EditProfileBtn() throws InterruptedException {
        click(PG_EditProfileBtn.ep_EditProfileBtn);
        Thread.sleep(1000);

    }

    public void EditFirstname(String firstName){
        click(PG_EditProfileBtn.epb_FirstName);
        type(PG_EditProfileBtn.epb_FirstName,firstName);

    }

    public void EditLastName(String lastName){
        click(PG_EditProfileBtn.epb_LastName);
        type(PG_EditProfileBtn.epb_LastName,lastName);

    }

    public void EditEmail(String email){
        click(PG_EditProfileBtn.epb_Email);
        type(PG_EditProfileBtn.epb_Email,email);

    }

    public void EditphoneNumber(String phonenumber){
        click(PG_EditProfileBtn.epb_PhoneNumber);
        type(PG_EditProfileBtn.epb_PhoneNumber,phonenumber);
    }



    public void ChooseFile(String filepath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("image_id")));
        fileInput.sendKeys(filepath);
        System.out.println("File uploaded successfully: " + filepath);

    }
    public void EditAddress1(String address1){
        click(PG_EditProfileBtn.epb_Address1);
        type(PG_EditProfileBtn.epb_Address1,address1);
    }

    public void EditAddress2(String address2){
        click(PG_EditProfileBtn.epb_Address2);
        type(PG_EditProfileBtn.epb_Address2,address2);
    }

    public void EditCity(String city){
        click(PG_EditProfileBtn.epb_City);
        type(PG_EditProfileBtn.epb_City,city);
    }

    public void EditState(String state){
        click(PG_EditProfileBtn.epb_state);
        type(PG_EditProfileBtn.epb_state,state);
    }

    public void EditZip(String zip){
        click(PG_EditProfileBtn.epb_zip);
        type(PG_EditProfileBtn.epb_zip,zip);
    }

    public void Editcountry(String country){
        click(PG_EditProfileBtn.epb_Country);
        type(PG_EditProfileBtn.epb_Country,country);
    }

    public void Editcomment(String comment){
        click(PG_EditProfileBtn.epb_comment);
        type(PG_EditProfileBtn.epb_comment,comment);
    }

    public void ClickSave(){
        click(PG_EditProfileBtn.epb_save);

    }







}
