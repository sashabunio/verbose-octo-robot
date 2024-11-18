package selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

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

    public static void getTotalAmountText (String expectedText) {
        $(totalAmount).shouldHave(Condition.text(expectedText));
    }




}
