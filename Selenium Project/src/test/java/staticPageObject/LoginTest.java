package staticPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void checkThatErrorIsShownAfterEnteringInvalidEmail() {
        LoginPage.loginWithInvalidEmail(driver, "123", "sasha123");
        Assert.assertTrue(LoginPage.errorIsShown(driver), "Error message is not shown");
    }

//    @Test
//    public void checkThatCreateAccountPageIsOpenedAfterClickingNewCustomersButton () {
//        LoginPage.clickNewCustomersButton(driver);
//        CreateAccountPage.createAccountPageIsDisplayed(driver);
//    }
}
