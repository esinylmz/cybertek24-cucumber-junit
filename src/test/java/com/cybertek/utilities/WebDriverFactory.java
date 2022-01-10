package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {


    /**
     * WebDriverFactory class:
     * is used create WebDriver(Selenium) object and return it.
     * It will open the browser and maximize it.
     * method:
     * getDriver (String browserType)
     * It will check browser type and returns object:
     * id browserTyepe is "chrome:
     * it will setup chrome driver, and return new ChromeDriver
     * id browserType is "firefox":
     * it will set uo firefox driver, and return new FirefoxDriver
     * EX:
     * Webdriver driver = WebDriverFactory.getDriver("chrome");
     * and use driver as normal
     */

        public static WebDriver getDriver(String browserType){
            if(browserType.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }else if(browserType.equalsIgnoreCase("firefox")){
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }else{
                System.out.println("Invalid BrowserType = "+browserType);
                return null;
            }
        }
    }

