package selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.conditions.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static staticPageObject.TestBase.driver;

public class OrderPage {

    private static By inputField = By.cssSelector("input[type='number']");
    private static By updateButton = By.cssSelector("button[type='submit'][name='update_cart_item']");
    private static By totalAmount = By.xpath("//strong[text()=\"$40.00\"]");

    public static void clearInputField () {
        $(inputField).clear();
    }

    public static void enterDuckQuantity (String value) {
        $(inputField).sendKeys(value);
    }

    public static void clickUpdateButton () {
        $(updateButton).click();
    }

    public static void getTotalAmountText (String exptectedText) {
        $(totalAmount).shouldHave(Condition.text(exptectedText));
    }




}
