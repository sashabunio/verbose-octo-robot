package selenide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;
import static staticPageObject.TestBase.driver;

public class HomePage {

    private static By homeButton = By.cssSelector("[class='fa fa-home'][title='Home']");
    private static By rubberDucksTab = By.cssSelector("[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/']");
    private static By subcategoryTab = By.xpath("//li[@class='category-2']" +
            "/a[@href='https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/']");
    private static By redDuck = By.cssSelector("a.link[title='Red Duck']");


    public static void clickHomeButton() {
        $(homeButton).click();
    }

    public static String getHomePageTitle() {
        return driver.getTitle();
    }

    public static void openRubberDucksTab() {
       $(rubberDucksTab).click();
    }

    public static void clickRedDuck() {
        $(redDuck).click();
    }

    public static void hoverOverRubberDucksTab () {
       actions().moveToElement($("[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/']")).perform();
    }

    public static void clickSubcategoryTab () {
        $(subcategoryTab).click();
    }


}
