package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class mouseHover {
    WebDriver driver;

    @BeforeTest
    public void mouseHover() {
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Softwares\\chromedriver-2.41.exe");
        driver = new ChromeDriver();
        //System.setProperty("webdriver.firefox.marionette", "C:\\Temp\\Softwares\\geckodriver-0.22.0.exe");
        //WebDriver webDriver = new FirefoxDriver();WebDriver webDriver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String baseUrl = "https://www.discovery.co.za/portal/";
        driver.get(baseUrl);

        WebElement element = driver.findElement(By.linkText(""));

        Actions action = new Actions(driver);

        action.moveToElement(element).build().perform();

        driver.findElement(By.linkText("iPads")).click();

    }
}