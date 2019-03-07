package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SwitchingWindows {

    public void SwitchingWindows() {
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Softwares\\chromedriver-2.41.exe");
        WebDriver webDriver = new ChromeDriver();
        //System.setProperty("webdriver.firefox.marionette", "C:\\Temp\\Softwares\\geckodriver-0.22.0.exe");
        //WebDriver webDriver = new FirefoxDriver();WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();

    }
}
