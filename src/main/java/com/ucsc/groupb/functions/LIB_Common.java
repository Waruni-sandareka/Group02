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

    public void bc_Login(String uname,String pwd) {
        navigateToURL(getURL());
        click(PG_Login.tf_UserName);
        type(PG_Login.tf_UserName,uname);
        click(PG_Login.tf_Password);
        type(PG_Login.tf_Password,pwd);
        click(PG_Login.btn_Login);
    }

    public void bc_VerifyDashboard(){

    }
    public void bc_VerifyErrorMessages(String message){

    }
}
