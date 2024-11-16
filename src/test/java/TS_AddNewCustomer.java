import com.ucsc.groupb.functions.LIB_Common;
import com.ucsc.groupb.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TS_AddNewCustomer extends TestBase {
    @BeforeMethod
    public void login() throws InterruptedException {
        LIB_Common.get().bc_Login("admin", "pointofsale");
        LIB_Common.get().selectLocation();
    }

    @Test
    public void tc_AddNewCustomer() {
        LIB_Common.get().navigateToNewCustomer();
    }

    @Test
    public void tc_AddNewCustomerDirect() {
        LIB_Common.get().navigateToAddNewCustomerDirect();
    }

    @Test
    public void tc_AddNewCustomer_EmptyFirstName() throws InterruptedException {
        LIB_Common.get().navigateToNewCustomer();
        LIB_Common.get().verifyFirstNameEmpty();
        Thread.sleep(1000);
    }

    @Test
    public void tc_VerifyDeleteButtonOnAddAdditionalPhoneNumber() throws InterruptedException {
        LIB_Common.get().navigateToNewCustomer();
        boolean isDeleteButtonVisible = LIB_Common.get().isDeleteButtonVisible();
        Thread.sleep(2000);
        Assert.assertTrue(isDeleteButtonVisible, "Delete button is not visible for the additional phone number field.");
    }

    @Test
    public void tc_AddNewCustomer_scroll() {
        LIB_Common.scroll(0, 900);
    }

    @Test
    public void tc_AddNewCustomer_Address1() throws InterruptedException {
        LIB_Common.get().navigateToNewCustomer();
        LIB_Common.scroll(0, 1300);
        LIB_Common.get().VerifyNonRequiredTextFeildAddress1("Wijerama");
        Thread.sleep(1000);
    }

    @Test
    public void tc_AddNewCustomer_Address2() throws InterruptedException {
        LIB_Common.get().navigateToNewCustomer();
        LIB_Common.scroll(0, 1300);
        LIB_Common.get().VerifyNonRequiredTextFeildAddress2("Nugegoda");
        Thread.sleep(1000);
    }

    @Test
    public void tc_AddNewCustomer_City() throws InterruptedException {
        LIB_Common.get().navigateToNewCustomer();
        LIB_Common.scroll(0, 1300);
        LIB_Common.get().VerifyNonRequiredTextFeildCity("Colombo");
        Thread.sleep(1000);
    }

}
