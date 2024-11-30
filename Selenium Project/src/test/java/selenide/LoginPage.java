package selenide;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static By emailAddressField = By.cssSelector("input[type='text']");
    private static By passwordField = By.cssSelector("input[type='password']");
    private static By loginButton = By.cssSelector("button[name='login']");
    private static By noticeError = By.xpath("//*[normalize-space(text())='Wrong password " +
            "or the account is disabled, or does not exist']");
    private static By newCustomersButton = By.xpath("//a[@href='https://litecart.stqa.ru/en/create_account']" +
            "[text()='New customers click here']");

//    @Step("Enter email to the 'email' field")
    public static void enterEmail (String email) {
        $(emailAddressField).sendKeys(email);
    }

//    @Step("Enter password to the 'password' field")
    public static void enterPassword (String password) {
        $(passwordField).sendKeys(password);
    }

//    @Step("Click the 'login' button")
    public static void clickLoginButton () {
        $(loginButton).click();
    }

//    @Step("Login with invalid credentials to get the error")
    public static void loginWithInvalidEmail (String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

//    @Step("Verify error is shown")
    public static void errorIsShown () {
        $(noticeError).shouldBe(Condition.visible);
    }

//    @Step(value = "Click 'New Customers' button")
    public static void clickNewCustomersButton () {
        $(newCustomersButton).click();
    }


}
