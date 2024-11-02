package com.ucsc.groupb.testbase;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestBase {



    Properties properties = loadPropertyFile();
  public Properties loadPropertyFile(){
      Properties prop = new Properties();
      try(InputStream intStream = TestBase.class.getClassLoader().getResourceAsStream("config.properties")){
          prop.load(intStream);
      } catch (IOException e) {
          e.printStackTrace();
      }
      return prop;
  }

  public String getURL(){
      return properties.getProperty("project.url");
  }

  //Implement custom commands for click, type, select, isDisplayed, isEnabled, scroll

}
