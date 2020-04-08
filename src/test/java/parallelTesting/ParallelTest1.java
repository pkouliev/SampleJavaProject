package parallelTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import utilities.BrowserUtilities;

public class ParallelTest1 {

    WebDriver driver;

    @Test
    void logoTest()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));

       Assert.assertTrue(logo.isDisplayed());
        BrowserUtilities.wait(5);
    }

    @Test
    void homePageTitle()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
        BrowserUtilities.wait(5);
    }

    @AfterTest
    void teardown()
    {
        BrowserUtilities.wait(2);
        driver.quit();
    }


}
