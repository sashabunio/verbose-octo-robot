package selenide;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Categories Page")
public class CategoriesPageTest extends TestBase {

    @Story("Check that blue duck is shown first when list is grouped by popularity")
    @Description("When user groups the list by popularity, blue duck should be shown first in the list as the most popular one")
    @Test // этот тест уже невалидный
    public void checkThatBlueDuckIsTheMostPopularOne () {
        String expectedResult = "Blue Duck";
        HomePage.openRubberDucksTab();
        CategoriesPage.clickPopularityButton();
        Assert.assertEquals(CategoriesPage.getAttributeOfBlueDuck("title"), expectedResult,
                "Blue duck is not the most popular item anymore");
    }
}
