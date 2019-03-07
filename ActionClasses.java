package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
@Test
public class ActionClasses {
    WebDriver driver ;
    @BeforeTest
    public void ActionClasses() {
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Softwares\\chromedriver-2.41.exe");
        driver = new ChromeDriver();
        //System.setProperty("webdriver.firefox.marionette", "C:\\Temp\\Softwares\\geckodriver-0.22.0.exe");
        //WebDriver webDriver = new FirefoxDriver();WebDriver webDriver = new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String baseUrl = "http://newtours.demoaut.com/";

        driver.get(baseUrl);
        WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a"));
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder.moveToElement(link_Home).build();

        String bgColor = td_Home.getCssValue("background-color");

        System.out.println("Before hover: " + bgColor);
        mouseOverHome.perform();
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);

        driver.close();
    }
}