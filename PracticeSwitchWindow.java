package Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class PracticeSwitchWindow {
    public static WebDriver driver;
    @Test
    public void swicthWindow(){
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Softwares\\chromedriver-2.41.exe");
        WebDriver webDriver = new ChromeDriver();
        //System.setProperty("webdriver.firefox.marionette", "C:\\Temp\\Softwares\\geckodriver-0.22.0.exe");
        //WebDriver webDriver = new FirefoxDriver();WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();

        // Create a new instance of the Chrome driver
        webDriver = new ChromeDriver();

        // Launch the URL

         webDriver.get("https://www.guru99.com/software-testing.html");
        // Store and Print the name of the First window on the console
        String handle= webDriver.getWindowHandle();
        System.out.println(handle);
        // Click on the Button "New Message Window"
        webDriver.findElement(By.xpath("//*[@id=\"g-mainbar\"]/div/div/div/div/div/div/div[2]/table[1]/tbody/tr[1]/td[1]/a/strong")).click();
        // Store and Print the name of all the windows open
        Set handles = webDriver.getWindowHandles();
        System.out.println(handles);
        // Pass a window handle to the other window
        for (String handle1 : webDriver.getWindowHandles()) {

            System.out.println(handle1);

            webDriver.switchTo().window(handle1);

        }

        // Closing Pop Up window

        webDriver.close();

        // Close Original window

        webDriver.quit();

    }

}

