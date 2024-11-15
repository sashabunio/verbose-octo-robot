package selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class CreateAccountPage {

    private static By newPage = By.id("create-account");

    public static void createAccountPageIsDisplayed () {
        $(newPage).should(Condition.visible);
    }
}
