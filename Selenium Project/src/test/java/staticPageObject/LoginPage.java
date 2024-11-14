package staticPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static By emailAddressField = By.cssSelector("input[type='text']");
    private static By passwordField = By.cssSelector("input[type='password']");
    private static By loginButton = By.cssSelector("button[name='login']");
    private static By noticeError = By.xpath("//*[normalize-space(text())='Wrong password " +
            "or the account is disabled, or does not exist']");
    private static By newCustomersButton = By.xpath("//a[@href='https://litecart.stqa.ru/en/create_account']" +
            "[text()='New customers click here']");

    public static void enterEmail (WebDriver driver, String email) {
        driver.findElement(emailAddressField).sendKeys(email);
    }

    public static void enterPassword (WebDriver driver, String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public static void clickLoginButton (WebDriver driver) {
        driver.findElement(loginButton).click();
    }

    public static void loginWithInvalidEmail (WebDriver driver, String email, String password) {
        enterEmail(driver, email);
        enterPassword(driver, password);
        clickLoginButton(driver);
    }

    public static boolean errorIsShown (WebDriver driver) {
        return driver.findElement(noticeError).isDisplayed();
    }

    public static void clickNewCustomersButton (WebDriver driver) {
        driver.findElement(newCustomersButton).click();
    }


}
