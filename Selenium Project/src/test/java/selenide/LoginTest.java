package selenide;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void checkThatErrorIsShownAfterEnteringInvalidEmail() {
        LoginPage.loginWithInvalidEmail("123", "sasha123");
        LoginPage.errorIsShown();
    }

    @Test
    public void checkThatCreateAccountPageIsOpenedAfterClickingNewCustomersButton () {
        LoginPage.clickNewCustomersButton();
        CreateAccountPage.createAccountPageIsDisplayed();
    }
}
