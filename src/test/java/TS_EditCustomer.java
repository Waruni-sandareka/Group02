import com.ucsc.groupb.functions.LIB_Common;
import com.ucsc.groupb.pages.PG_EditProfileBtn;
import com.ucsc.groupb.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TS_EditCustomer extends TestBase {

    @BeforeMethod
    public void login() throws InterruptedException {
        LIB_Common.get().bc_Login("admin", "pointofsale");
        LIB_Common.get().selectLocation();
        Thread.sleep(1000);
        LIB_Common.get().NavigateToUser();
        LIB_Common.get().EditProfileBtn();

    }

    @Test
    public void editFirstName() {
        WebElement firstNameField = driver.findElement(PG_EditProfileBtn.epb_FirstName.getLocator());
        firstNameField.clear();
        LIB_Common.get().EditFirstname("Group");
    }

    @Test
    public void editLastName() {
        WebElement lastNameField = driver.findElement(PG_EditProfileBtn.epb_LastName.getLocator());
        lastNameField.clear();
        LIB_Common.get().EditLastName("No:002");
    }

    @Test
    public void editemail() {
        WebElement lastNameField = driver.findElement(PG_EditProfileBtn.epb_Email.getLocator());
        lastNameField.clear();
        LIB_Common.get().EditEmail("group2@gmail.com");
    }

    @Test
    public void editPhoneNumber() {
        WebElement lastNameField = driver.findElement(PG_EditProfileBtn.epb_PhoneNumber.getLocator());
        lastNameField.clear();
        LIB_Common.get().EditphoneNumber("011234567");
    }

    @Test
    public void FileUpload() throws InterruptedException {
        String filePath = "C:\\Users\\User\\Documents\\Automation\\UCSC\\Group Project\\Group02\\image1.jpg";
        LIB_Common.get().ChooseFile(filePath);
        Thread.sleep(1000);

    }

    @Test
    public void InvalidFileUpload() throws InterruptedException {
        String filePath = "C:\\Users\\User\\Documents\\Automation\\UCSC\\Group Project\\Group02\\Book1.xlsx";
        LIB_Common.get().ChooseFile(filePath);
        Thread.sleep(1000);

    }


    @Test
    public void editAddress1() {
        WebElement lastNameField = driver.findElement(PG_EditProfileBtn.epb_Address1.getLocator());
        lastNameField.clear();
        LIB_Common.get().EditAddress1("UCSC");
    }

    @Test
    public void editAddress2() {
        WebElement lastNameField = driver.findElement(PG_EditProfileBtn.epb_Address2.getLocator());
        lastNameField.clear();
        LIB_Common.get().EditAddress2("Colombo");
    }

    @Test
    public void editCity() {
        WebElement lastNameField = driver.findElement(PG_EditProfileBtn.epb_City.getLocator());
        lastNameField.clear();
        LIB_Common.get().EditCity("Colombo");
    }

    @Test
    public void editState() {
        WebElement lastNameField = driver.findElement(PG_EditProfileBtn.epb_state.getLocator());
        lastNameField.clear();
        LIB_Common.get().EditState("Western Province");
    }

    @Test
    public void editZip() {
        WebElement lastNameField = driver.findElement(PG_EditProfileBtn.epb_zip.getLocator());
        lastNameField.clear();
        LIB_Common.get().EditZip("12345");
    }




}























