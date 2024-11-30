package selenide;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
//import static staticPageObject.TestBase.driver;

public class HomePage {

    private static By homeButton = By.cssSelector("[class='fa fa-home'][title='Home']");
    private static By rubberDucksTab = By.cssSelector("[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/']");
    private static By subcategoryTab = By.xpath("//li[@class='category-2']" +
            "/a[@href='https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/']");
    private static By redDuck = By.cssSelector("div#box-latest-products>div.content>ul>li>a.link[title='Red Duck']");


//    @Step("click home button")
    public static void clickHomeButton() {
        $(homeButton).click();
    }

//    @Step("get Home Page title")
    public static String getHomePageTitle() {
        return title();
    }

//    @Step("open Rubber Ducks tab")
    public static void openRubberDucksTab() {
       $(rubberDucksTab).click();
    }

//    @Step("click Red Duck from the list")
    public static void clickRedDuck() {
        $(redDuck).click();
    }

//    @Step("hover over Rubber Ducks tab to get the Subcategory tab")
    public static void hoverOverRubberDucksTab () {
       actions().moveToElement($("[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/']")).perform();
    }

//    @Step("click Subcategory tab")
    public static void clickSubcategoryTab () {
        $(subcategoryTab).click();
    }


}
