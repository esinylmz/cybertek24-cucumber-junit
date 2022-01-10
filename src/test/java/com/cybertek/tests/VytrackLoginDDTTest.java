package com.cybertek.tests;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;

public class VytrackLoginDDTTest {

    String filePath = "VyTrackQa2Users.xlsx";

    @Before
    public void setUp() {

        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
    }


        @Test
        public void loginDDTTest () throws IOException {

            WebElement login = Driver.getDriver().findElement(By.id("prependedInput"));
            WebElement password = Driver.getDriver().findElement(By.id("prependedInput2"));
            WebElement submitBtn = Driver.getDriver().findElement(By.id("_submit"));


          //FileInputStream data = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(filePath);
            XSSFSheet worksheet = workbook.getSheetAt(0);
            System.out.println(worksheet.getRow(1).getCell(0));


            login.sendKeys(worksheet.getRow(1).getCell(0).toString());
            password.sendKeys(worksheet.getRow(1).getCell(1).toString());
            submitBtn.click();



//

        }
        }

