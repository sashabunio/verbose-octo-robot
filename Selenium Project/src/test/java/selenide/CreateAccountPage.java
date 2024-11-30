package selenide;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class CreateAccountPage {

    private static By newPage = By.id("create-account");

//    @Step("verify that user is navigated to the Create Account page")
    public static void createAccountPageIsDisplayed () {
        $(newPage).should(Condition.visible);
    }
}
