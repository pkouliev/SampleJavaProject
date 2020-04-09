package tests.parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.AbstractBaseTest;

public class ParallelTest1 extends AbstractBaseTest {



    @Test
    public void logoTest()
    {
        WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));

       Assert.assertTrue(logo.isDisplayed());

    }

    @Test
    public void homePageTitle()
    {
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }


}
