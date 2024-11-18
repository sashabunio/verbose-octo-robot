package selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static staticPageObject.TestBase.driver;

public class CartSummary {

    private static By cartItems = By.xpath("//img[@src='/includes/templates/default.catalog/images/cart_filled.png']");
    private static By checkoutButton = By.cssSelector("a.link[href='https://litecart.stqa.ru/en/checkout']");

    public static void cartItemIsDisplayed () {
        $(cartItems).shouldBe(Condition.visible);
    }

    public static void clickCheckoutButton () {
        $(checkoutButton).click();
    }

}