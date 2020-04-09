package tests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AssertionExamples extends AbstractBaseTest {


    @Test(priority = 1)
    void logoTest() {

        WebElement logo =  driver.findElement(By.xpath("//div[@id='divLogo']//img"));
        //Assert.assertTrue(logo.isDisplayed(), "Logo not displayed on the page");
        Assert.assertFalse(logo.isDisplayed(), "Logo displayed on the page");

    }

    @Test(priority = 2)
    void homePageTitle() {

      String title =  driver.getTitle();
      //Assert.assertEquals("OrangeHRM123",title, "Title is not matched");
        Assert.assertEquals(title,"OrangeHRM123", "Title is not matched");
    }
}
