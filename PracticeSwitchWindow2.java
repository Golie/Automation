package Selenium;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static Selenium.PracticeSwitchWindow.driver;

public class PracticeSwitchWindow2 {
    WebDriver driver;
    @Test
    public void swicthWindow2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Softwares\\chromedriver-2.41.exe");
        driver = new ChromeDriver();
        //System.setProperty("webdriver.firefox.marionette", "C:\\Temp\\Softwares\\geckodriver-0.22.0.exe");
        //WebDriver webDriver = new FirefoxDriver();WebDriver webDriver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver = new ChromeDriver();

        // Put an Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

      // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Launch the URL

        driver.get("https://www.guru99.com/");

        // Click on the Button "Alert Box"

        driver.findElement(By.id("alert")).click();

        // Switch to JavaScript Alert window

          Alert myAlert = driver.switchTo().alert();

        // Accept the Alert

        myAlert.accept();

        // Close Original window

        driver.close();

    }
}
