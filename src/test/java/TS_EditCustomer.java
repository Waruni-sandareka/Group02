import com.ucsc.groupb.functions.LIB_Common;
import com.ucsc.groupb.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TS_EditCustomer extends TestBase {

    @BeforeMethod
    public void login() throws InterruptedException {
        LIB_Common.get().bc_Login("admin", "pointofsale");
       // LIB_Common.get().selectLocation();
    }

    @Test
    public void navigateEditProfile() throws InterruptedException {
        LIB_Common.get().NavigateToUser();
        Thread.sleep(1000);
    }

    @Test
    public void tc_EditCustomer_EmptyFirstName() throws InterruptedException {
        LIB_Common.get().NavigateToUser();
        LIB_Common.get().verifyEditProfileFirstNameEmpty();
        Thread.sleep(1000);
    }

    @Test
    public void tc_EditCustomer_EmptyEmail() throws InterruptedException {
        LIB_Common.get().NavigateToUser();
        LIB_Common.get().verifyEditProfileEmailEmpty();
        Thread.sleep(1000);
    }

    @Test
    public void tc_EditCustomer_EmptyUserName() throws InterruptedException {
        LIB_Common.get().NavigateToUser();
        LIB_Common.get().verifyEditProfileUserNameEmpty();
        Thread.sleep(1000);
    }

    @Test
    public void tc_EditCustomer_ValidEmail() throws InterruptedException {
        LIB_Common.get().NavigateToUser();
        LIB_Common.get().verifyEditProfileWithValidEmail();
        Thread.sleep(1000);
    }





}
