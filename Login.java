package Selenium;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class Login {
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
    public void testLogin(){
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Softwares\\chromedriver-2.41.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        webDriver.get("https://www.google.com");
        System.out.println(webDriver.getTitle());

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,-1000)");

        /*WebElement element = webDriver.findElement(By.name("q"));
        element.sendKeys("GitHub!");
        element.submit();*/
        WebElement h3Element = webDriver.findElement(By.className("LC20lb"));
        h3Element.sendKeys("Login - GitHub");
        h3Element.click();
        WebElement Username = webDriver.findElement(By.id("login_field"));
        Username.sendKeys("NathanGit00");
        WebElement Password = webDriver.findElement(By.id("password"));
        Password.sendKeys("Nathan@2014");
        WebElement Signin = ((ChromeDriver) webDriver).findElementByClassName("btn btn-primary btn-block");
        Signin.click();

    } }

