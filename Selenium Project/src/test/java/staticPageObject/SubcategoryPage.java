package staticPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubcategoryPage {

    private static By subcategoryHeader = By.xpath("//h1[@class='title']");

    public static boolean subcategoryHeaderIsDisplayed (WebDriver driver) {
        return driver.findElement(subcategoryHeader).isDisplayed();
    }
}
