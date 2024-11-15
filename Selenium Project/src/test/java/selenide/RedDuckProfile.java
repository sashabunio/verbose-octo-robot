package selenide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class RedDuckProfile {

    private static By addToCartButton = By.cssSelector("button[name='add_cart_product']");

    public static void clickAddToCartButton () {
        $(addToCartButton).click();
    }
}
