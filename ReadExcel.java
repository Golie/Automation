package Selenium;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ReadExcel {

    public void read_from_excel() {
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Softwares\\chromedriver-2.41.exe");
        WebDriver webDriver = new ChromeDriver();
        //System.setProperty("webdriver.firefox.marionette", "C:\\Temp\\Softwares\\geckodriver-0.22.0.exe");
        //WebDriver webDriver = new FirefoxDriver();WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        //webDriver.get("https://github.com/login");
    }
    public static void main(String[] s) {

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\p782530\\Desktop\\Files\\Login.xlsx");

            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(1);
            Cell cell = row.getCell(0);

            System.out.println(cell);
            System.out.println(sheet.getRow(1).getCell(1));

        }catch(Exception e){
            e.printStackTrace();
        }

    /* public static void writeToExcel(){
            try {
                FileInputStream fis = new FileInputStream("C:\\Users\\p782530\\Desktop\\Files\\Login.xlsx");

                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheetAt(0);
                Row row = sheet.getRow(1);
                Cell cell = row.getCell(0);

            }
        }*/
    }
}
