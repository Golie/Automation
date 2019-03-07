package Selenium;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.invoke.empty.Empty;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    @Test
    public void LoginTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Softwares\\chromedriver-2.41.exe");
        WebDriver webDriver = new ChromeDriver();
        //System.setProperty("webdriver.firefox.marionette", "C:\\Temp\\Softwares\\geckodriver-0.22.0.exe");
        //WebDriver webDriver = new FirefoxDriver();WebDriver webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        webDriver.get("https://github.com/login");
        WebElement UserLogin = webDriver.findElement(By.id("login_field"));
        UserLogin.sendKeys("NathanGit00");
        WebElement userPassword = webDriver.findElement(By.id("password"));
        userPassword.sendKeys("Nathan@2014");
        WebElement SignIn =  webDriver.findElement(By.name("commit"));
        SignIn.click();
        //XPath
        WebElement startproject = webDriver.findElement(By.xpath("//*[@id='js-pjax-container']/div[1]/div/div/a[2]"));
        startproject.click();
        WebElement Repo_name = ((ChromeDriver) webDriver).findElementByXPath("//*[@id=\"repository_name\"]");
        Repo_name.sendKeys("Nathan0vtegwe");
        WebElement Description = webDriver.findElement(By.xpath("//*[@id=\"repository_description\"]"));
        Description.sendKeys("Repository for Nathan");
        WebElement createRepository = webDriver.findElement(By.cssSelector("#new_repository > div.js-with-permission-fields > button"));
        createRepository.click();
        //WebElement importcode = webDriver.findElement(By.cssSelector("#js-repo-pjax-container > div.container.new-discussion-timeline.experiment-repo-nav > div.repository-content > div.Box.Box--spacious.js-git-clone-help-container > div:nth-child(2) > div:nth-child(3) > a"));
        //importcode.click();

    }
}