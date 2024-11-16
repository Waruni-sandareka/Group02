package com.ucsc.groupb.testbase;

import com.ucsc.groupb.functions.LIB_Common;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class TestNGHelper {
    public static WebDriver driver;

    protected BrowserFactory browserFactory = BrowserFactory.getBrowserFactory();

    @BeforeSuite
    public void beforeSuite(){


    }

    @BeforeTest
    public void beforeTest(){

    }

    @BeforeClass
    public void beforeClass(){

    }

    @BeforeMethod
    public void beforeMethod(ITestResult iTestResult){
        driver=browserFactory.getDriver();
        String testName = iTestResult.getMethod().getMethodName();
        System.out.println(testName);
        //LIB_Common.get().bc_Login("admin", "pointofsale");
    }

    @AfterSuite
    public void afterSuite(){

    }

    @AfterTest
    public void afterTest(){

    }

    @AfterClass
    public void afterClass(){

    }

    @AfterMethod
    public void afterMethod(){
        browserFactory.quitDriver();
    }


}
