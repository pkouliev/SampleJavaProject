package tests;

import org.testng.annotations.Test;

public class DataProviderExample extends AbstractBaseTest {


    @Test(dataProvider = "LoginDataProvider", dataProviderClass=CustomDataProvider.class)
    public void loginTest(String email, String pwd)
    {
        System.out.println(email+"    "+pwd);
    }
}
