package staticPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {

    private static By inputField = By.cssSelector("input[type='number']");
    private static By updateButton = By.cssSelector("button[type='submit'][name='update_cart_item']");
    private static By totalAmount = By.xpath("//strong[text()=\"$40.00\"]");

    public static void clearInputField (WebDriver driver) {
        driver.findElement(inputField).clear();
    }

    public static void enterDuckQuantity (WebDriver driver, String value) {
        driver.findElement(inputField).sendKeys(value);
    }

    public static void clickUpdateButton (WebDriver driver) {
        driver.findElement(updateButton).click();
    }

    public static void waitUntilPageIsUpdating (WebDriver driver, String expectedText) {
        WebElement totalAmount = (new WebDriverWait(driver, Duration.ofSeconds(4))).
                until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath(expectedText)));
    }

    public static String getTotalAmountText (WebDriver driver) {
        return driver.findElement(totalAmount).getText();
    }




}
