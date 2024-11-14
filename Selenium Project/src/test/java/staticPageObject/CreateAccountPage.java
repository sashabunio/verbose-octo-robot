package staticPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {

    private static By newPage = By.id("create-account");

    public static boolean createAccountPageIsDisplayed (WebDriver driver) {
       return driver.findElement(newPage).isDisplayed();
    }
}
