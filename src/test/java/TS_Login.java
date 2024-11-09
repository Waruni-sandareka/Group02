import com.ucsc.groupb.functions.LIB_Common;
import com.ucsc.groupb.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS_Login extends TestBase {

    @Test
    public void tc_ValidLogin() {
        LIB_Common.get().bc_Login("admin", "pointofsale");
        Assert.assertTrue(LIB_Common.get().bc_VerifyDashboard(), "Dashboard verification failed. Login was unsuccessful.");
    }

    @Test
    public void tc_InvalidLogin_EmptyUsername() {
        LIB_Common.get().bc_Login("", "pointofsale");
        String expectedMessage = "Invalid username/password";
        Assert.assertTrue(LIB_Common.get().bc_VerifyErrorMessages(expectedMessage), "Error message verification failed for empty fields.");
    }

    @Test
    public void tc_InvalidLogin_EmptyPassword() {
        LIB_Common.get().bc_Login("admin", "");
        String expectedMessage = "Invalid username/password";
        Assert.assertTrue(LIB_Common.get().bc_VerifyErrorMessages(expectedMessage), "Error message verification failed for empty fields.");
    }

    @Test
    public void tc_InvalidLogin_EmptyFields() {
        LIB_Common.get().bc_Login("", "");
        String expectedMessage = "Invalid username/password";
        Assert.assertTrue(LIB_Common.get().bc_VerifyErrorMessages(expectedMessage), "Error message verification failed for empty fields.");
    }

    @Test
    public void tc_InvalidLogin_InvalidUsername() {
        LIB_Common.get().bc_Login("invalidUser", "pointofsale");
        String expectedMessage = "Invalid username/password";
        Assert.assertTrue(LIB_Common.get().bc_VerifyErrorMessages(expectedMessage), "Error message verification failed for invalid credentials.");
    }

    @Test
    public void tc_InvalidLogin_InvalidPassword() {
        LIB_Common.get().bc_Login("admin", "invalidPass");
        String expectedMessage = "Invalid username/password";
        Assert.assertTrue(LIB_Common.get().bc_VerifyErrorMessages(expectedMessage), "Error message verification failed for invalid credentials.");
    }

    @Test
    public void tc_InvalidLogin_InvalidCredentials() {
        LIB_Common.get().bc_Login("invalidUser", "invalidPass");
        String expectedMessage = "Invalid username/password";
        Assert.assertTrue(LIB_Common.get().bc_VerifyErrorMessages(expectedMessage), "Error message verification failed for invalid credentials.");
    }
}
