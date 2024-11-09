package com.ucsc.groupb.functions;

import com.ucsc.groupb.pages.PG_Login;
import com.ucsc.groupb.testbase.TestBase;

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
}
