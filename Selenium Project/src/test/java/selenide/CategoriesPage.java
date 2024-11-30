package selenide;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;

public class CategoriesPage {

    private static By popularityButton = By.cssSelector
            ("a.button[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/?category_id=1&page=1&sort=popularity']");
    private static By blueDuck = By.cssSelector("ul[class='listing-wrapper products']>li>a");


//    @Step("Get Rubber Duck tab title")
    public static String getRubberDuckTabTitle () {
        return title();
    }

//    @Step("click Popularity button to change sorting")
    public static void clickPopularityButton () {
        $(popularityButton).click();
    }

//    @Step("get attribute of blue duck item")
    public static String getAttributeOfBlueDuck (String attribute) {
        return $(blueDuck).getAttribute(attribute);
    }
}
