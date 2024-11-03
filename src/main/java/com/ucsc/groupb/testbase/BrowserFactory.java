package com.ucsc.groupb.testbase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class BrowserFactory {
//    private WebDriver driver;

    private static BrowserFactory browserFactory;
    PropertyHandler propertyHandler = new PropertyHandler();

    ThreadLocal<WebDriver> tlWebDriver = ThreadLocal.withInitial(()->{
        String browser = propertyHandler.getBrowser();
        WebDriver driver = switch (browser) {
            case "chrome" -> WebDriverManager.chromedriver().create();
            case "firefox" -> WebDriverManager.firefoxdriver().create();
            case "edge" -> WebDriverManager.edgedriver().create();
            case "safari" -> WebDriverManager.safaridriver().create();
            case "opera" -> WebDriverManager.operadriver().create();
            default -> throw new RuntimeException("Wrong browser");
        };

        driver.manage().window().maximize();
        return driver;
    });

    private BrowserFactory() {
    }

    public static BrowserFactory getBrowserFactory(){
        if (browserFactory == null) {
            browserFactory = new BrowserFactory();
        }
        return browserFactory;
    }

    public WebDriver getDriver(){
        return tlWebDriver.get();
    }

    public void quitDriver(){
        tlWebDriver.get().quit();
        tlWebDriver.remove();
    }


}
