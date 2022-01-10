package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.IOException;

public class ExcelRead {
    @Test
    public void readingFromExcel() throws IOException {
        //Workbook > worksheet > Row > Cell
        //Open excel workbook using XSSWorkbook class
        //pass file in the constructor

        XSSFWorkbook workbook = new XSSFWorkbook("Employees.xlsx");

        XSSFSheet worksheet = workbook.getSheet("data");

        //print Mike
        System.out.println(worksheet.getRow(1).getCell(0));

        //print Romanenko
        System.out.println(worksheet.getRow(3).getCell(1));
    }



}
