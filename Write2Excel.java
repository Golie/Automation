package Selenium;
//import jxl.write.WriteException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
@Test
public class Write2Excel {
    public void Write2Excels() {
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Softwares\\chromedriver-2.41.exe");
        WebDriver webDriver = new ChromeDriver();
        //System.setProperty("webdriver.firefox.marionette", "C:\\Temp\\Softwares\\geckodriver-0.22.0.exe");
        //WebDriver webDriver = new FirefoxDriver();WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        try {
            //define a workbook
            Workbook wb = new HSSFWorkbook();
            //define output file
            FileOutputStream fileOut = new FileOutputStream("workbook.xls");
            //add a sheet to the workbook
            Sheet sheet = wb.createSheet("TestCases");
            // Create a row and put some cells in it. Rows are 0 based.
            //define first row
            Row row0 = sheet.createRow((short)0);
            // Create a cell and put a value in it.
            Cell cell = row0.createCell(0);
            cell.setCellValue("TestId");
            //add more cells and values
            row0.createCell(1).setCellValue("TestName");
            row0.createCell(2).setCellValue("TestModule");
            row0.createCell(3).setCellValue("TestType");
            row0.createCell(4).setCellValue("TestSteps");
            row0.createCell(5).setCellValue("Action");
            row0.createCell(6).setCellValue("TestResult");
            row0.createCell(7).setCellValue("Note");
            row0.createCell(8).setCellValue("Comments");
            //add row 1 content
            Row row1=sheet.createRow((short)1);
            row1.createCell(0).setCellValue("1");
            row1.createCell(1).setCellValue("Login");
            row1.createCell(2).setCellValue("Dashboard");
            row1.createCell(3).setCellValue("Regression");
            row1.createCell(4).setCellValue("1");
            row1.createCell(5).setCellValue("Open Browser");
            row1.createCell(6).setCellValue("Browser Should Open");
            row1.createCell(7).setCellValue("This is a note");
            row1.createCell(8).setCellValue("Add comments");
            // All sheets and cells added. Now write out the workbook

            wb.write(fileOut);
            fileOut.close();
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }
}
