package staticPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    private static By homeButton = By.cssSelector("[class='fa fa-home'][title='Home']");
    private static By rubberDucksTab = By.cssSelector("[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/']");
    private static By subcategoryTab = By.xpath("//li[@class='category-2']" +
            "/a[@href='https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/']");
    private static By redDuck = By.cssSelector("a.link[title='Red Duck']");


    public static void clickHomeButton(WebDriver driver) {
        driver.findElement(homeButton).click();
    }

    public static String getHomePageTitle(WebDriver driver) {
        return driver.getTitle();
    }

    public static void openRubberDucksTab(WebDriver driver) {
        driver.findElement(rubberDucksTab).click();
    }

    public static void clickRedDuck(WebDriver driver) {
        driver.findElement(redDuck).click();
    }

    public static void hoverOverRubberDucksTab (WebDriver driver) { // как работать с Actions классом в Page Object?
        WebElement rubberDucksTab = driver.findElement(By. cssSelector("[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(rubberDucksTab).perform();
    }

    public static void clickSubcategoryTab (WebDriver driver) {
        driver.findElement(subcategoryTab).click();
    }


}
