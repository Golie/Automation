package Selenium;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;


/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @BeforeTest
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Softwares\\chromedriver-2.41.exe");
        WebDriver webDriver = new ChromeDriver();
        //System.setProperty("webdriver.firefox.marionette", "C:\\Temp\\Softwares\\geckodriver-0.22.0.exe");
        //WebDriver webDriver = new FirefoxDriver();WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();

        webDriver.get("https://www.google.com");
        System.out.println(webDriver.getTitle());

        WebElement element = webDriver.findElement(By.name("q"));
        element.sendKeys("GitHub!");
        element.submit();
        // The script open the Github website by using the classname
        // WebElement h3Element = webDriver.findElement(By.className("LC20lb"));
        //h3Element.click();
        // waiting time for the page to load

        //signing up on GitHub
        // The script for signing up into Github website by using the classname
        WebElement link = webDriver.findElement(By.xpath("//a[text()='Join GitHub' or text()='Sign up']"));
        link.click();

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,-1000)");

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        // Register to GitHub
        WebElement Username = webDriver.findElement(By.id("user_login"));
        Username.sendKeys("NathanGit001");
        WebElement email = webDriver.findElement(By.id("user_email"));
        email.sendKeys("golienyirenda@icloud.com");
        WebElement Password = webDriver.findElement(By.id("user_password"));
        // password.clear();
        Password.sendKeys("Nathan@2014");
        //password.submit();
        WebElement submit = ((ChromeDriver) webDriver).findElementById("signup_button");
        submit.click();


        // Login to GitHub

        //          link.sendKeys("Sign up for GitHub");
//          link.submit();
        //webDriver.close();

    }
}
