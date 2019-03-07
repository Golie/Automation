package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class myClass {
    public static WebDriver driver;
    @AfterClass
    @Test
    public void myClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Softwares\\chromedriver-2.41.exe");
        WebDriver webDriver = new ChromeDriver();
        //System.setProperty("webdriver.firefox.marionette", "C:\\Temp\\Softwares\\geckodriver-0.22.0.exe");
        //WebDriver webDriver = new FirefoxDriver();WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        String baseUrl = "http://newtours.demoaut.com/";
        webDriver.get(baseUrl);
        //String verifyHomepageTitle;
        webDriver.quit();
    }

    public static void verifyHomepageTitle() {
        String expectedTitle = " Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        try {
            Assert.assertEquals(actualTitle, expectedTitle);
            System.out.println("Test passed");
        } catch (Throwable e) {
            System.out.println("Test failed");
        }
    }
}




