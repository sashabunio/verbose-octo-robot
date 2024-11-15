package selenide;

import com.codeborne.selenide.Condition;
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

    public static void enterEmail (String email) {
        $(emailAddressField).sendKeys(email);
    }

    public static void enterPassword (String password) {
        $(passwordField).sendKeys(password);
    }

    public static void clickLoginButton () {
        $(loginButton).click();
    }

    public static void loginWithInvalidEmail (String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    public static void errorIsShown () {
        $(noticeError).shouldBe(Condition.visible);
    }

    public static void clickNewCustomersButton () {
        $(newCustomersButton).click();
    }


}
