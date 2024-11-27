package selenide;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Login Page")
public class LoginTest extends TestBase {

    @Story("Check that error is shown after entering invalid email")
    @Description("When user enters invalid email, the error should be shown above and user should stay on the login page")
    @Test
    public void checkThatErrorIsShownAfterEnteringInvalidEmail() {
        LoginPage.loginWithInvalidEmail("123", "sasha123");
        LoginPage.errorIsShown();
    }

    @Story("Check that create account page is opened after clicking 'new customers' button")
    @Description("When user clicks 'new customers' button, they should be navigated to the 'Create account' page ")
    @Test
    public void checkThatCreateAccountPageIsOpenedAfterClickingNewCustomersButton () {
        LoginPage.clickNewCustomersButton();
        CreateAccountPage.createAccountPageIsDisplayed();
    }
}
