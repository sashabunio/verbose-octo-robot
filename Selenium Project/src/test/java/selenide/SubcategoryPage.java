package selenide;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class SubcategoryPage {

    private static By subcategoryHeader = By.xpath("//h1[@class='title']");

    public static void subcategoryHeaderIsDisplayed () {
        $(subcategoryHeader).shouldBe(Condition.visible);
    }
}
