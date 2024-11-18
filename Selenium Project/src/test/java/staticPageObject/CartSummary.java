package staticPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartSummary {

    private static By cartItems = By.xpath("//img[@src='/includes/templates/default.catalog/images/cart_filled.png']");
    private static By checkoutButton = By.cssSelector("a.link[href='https://litecart.stqa.ru/en/checkout']");


    public static void waitUntilAmountIsUpdated(WebDriver driver, String locator) {
        WebElement cartItems = ((new WebDriverWait(driver, Duration.ofSeconds(4))).
                until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath(locator))));
    }

    public static boolean cartItemIsDisplayed (WebDriver driver) {
        return driver.findElement(cartItems).isDisplayed();
    }

    public static void clickCheckoutButton (WebDriver driver) {
        driver.findElement(checkoutButton).click();
    }

}
