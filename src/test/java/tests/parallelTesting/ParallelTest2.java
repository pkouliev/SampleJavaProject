package tests.parallelTesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.AbstractBaseTest;
import utilities.BrowserUtilities;

public class ParallelTest2 extends AbstractBaseTest {

    @Test
    void LoginTest() {

        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
        BrowserUtilities.wait(5);

    }
}
