package com.ucsc.groupb.testbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class TestBase extends TestNGHelper{

    PropertyHandler propertyHandler = new PropertyHandler();

    public String getURL(){
        String url = propertyHandler.getURL();
        return url;
    }

    public void click(Enum<?> locator){
        WebElement element;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        try {
            element =wait.until(ExpectedConditions.elementToBeClickable(fetchLocator(locator)));
            if(element.isEnabled()){
                element.click();
            }
        }catch (NoSuchElementException e){
            System.out.println("No such element found "+e);
        }
    }

    public void sendKeys(Enum<?> locator, String text) {
        WebElement element;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        try {
            element = wait.until(ExpectedConditions.elementToBeClickable(fetchLocator(locator)));
            if (element.isEnabled()) {
                element.clear(); // Clear existing text if necessary
                element.sendKeys(text);
            }
        } catch (NoSuchElementException e) {
            System.out.println("No such element found: " + e);
        }
    }

    public void type(Enum<?> locator,String text){
        WebElement element;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        try {
            element =wait.until(ExpectedConditions.elementToBeClickable(fetchLocator(locator)));
            if(element.isEnabled()){
                element.click();
                element.clear();
                element.sendKeys(text);
            }
        }catch (NoSuchElementException e){
            System.out.println("No such element found "+e);
        }
    }

    private By fetchLocator(Enum<?> locatorEnum) {
        String locator = locatorEnum.toString();
        if (locator.startsWith("//") || locator.startsWith("(//")) {
            return By.xpath(locator);
        } else if (locator.startsWith("#")) {
            return By.id(locator.substring(1)); // Remove '#' from ID locator
        } else if (locator.startsWith(".")) {
            return By.className(locator.substring(1)); // Remove '.' from class locator
        } else {
            return By.cssSelector(locator);
        }
    }

    public void navigateToURL(String url){
        try {
            driver.get(url);
        }catch (Exception e){
            System.out.println("URL is incorrect "+e);
        }
    }

    public boolean isElementDisplayed(Enum<?> locator) {
        try {
            WebElement element = driver.findElement(fetchLocator(locator));
            return element.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public String getText(Enum<?> locator) {
        WebElement element = driver.findElement(fetchLocator(locator));
        return element.getText();
    }




//    Properties properties = loadPropertyFile();
//  public Properties loadPropertyFile(){
//      Properties prop = new Properties();
//      try(InputStream intStream = TestBase.class.getClassLoader().getResourceAsStream("config.properties")){
//          prop.load(intStream);
//      } catch (IOException e) {
//          e.printStackTrace();
//      }
//      return prop;
//  }

//  public String getURL(){
//      return properties.getProperty("project.url");
//  }

  //Implement custom commands for click, type, select, isDisplayed, isEnabled, scroll

}
