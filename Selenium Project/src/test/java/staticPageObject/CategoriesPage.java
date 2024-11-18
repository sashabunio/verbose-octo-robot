package staticPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoriesPage {

    private static By popularityButton = By.cssSelector
            ("a.button[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/?category_id=1&page=1&sort=popularity']");
    private static By blueDuck = By.cssSelector("ul[class='listing-wrapper products']>li>a");


    public static String getRubberDuckTabTitle (WebDriver driver) {
        return driver.getTitle();
    }

    public static void clickPopularityButton (WebDriver driver) {
        driver.findElement(popularityButton).click();
    }

    public static String getAttributeOfBlueDuck(WebDriver driver, String attribute) {
        return driver.findElement(blueDuck).getAttribute(attribute);
    }
}
