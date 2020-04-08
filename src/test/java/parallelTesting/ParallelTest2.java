package parallelTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;

public class ParallelTest2 {

    WebDriver driver;

    @Test
    void LoginTest() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
        BrowserUtilities.wait(5);

    }

    @AfterMethod
    void teardown() {
        driver.quit();
    }
}
