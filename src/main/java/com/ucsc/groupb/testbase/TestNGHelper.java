package com.ucsc.groupb.testbase;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class TestNGHelper {
    public static WebDriver driver;

    protected BrowserFactory browserFactory = BrowserFactory.getBrowserFactory();

    @BeforeSuite
    public void beforeSuite(){
        driver=browserFactory.getDriver();

    }

    @BeforeTest
    public void beforeTest(){

    }

    @BeforeClass
    public void beforeClass(){

    }

    @BeforeMethod
    public void beforeMethod(ITestResult iTestResult){
        String testName = iTestResult.getMethod().getMethodName();
        System.out.println(testName);

    }

    @AfterSuite
    public void afterSuite(){
        browserFactory.quitDriver();
    }

    @AfterTest
    public void afterTest(){

    }

    @AfterClass
    public void afterClass(){

    }

    @AfterMethod
    public void afterMethod(){

    }


}
