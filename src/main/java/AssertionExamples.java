import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AssertionExamples {

    WebDriver driver;

    @BeforeClass
    void setup() {

        WebDriverManager.chromedriver().version("79.0").setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }

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

    @AfterClass
    void tearDown() {
        driver.quit();

    }
}
