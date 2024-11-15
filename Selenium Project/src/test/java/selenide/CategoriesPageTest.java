package selenide;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoriesPageTest extends TestBase {

    @Test // этот тест уже невалидный
    public void checkThatBlueDuckIsTheMostPopularOne () {
        String expectedResult = "Blue Duck";
        HomePage.openRubberDucksTab();
        CategoriesPage.clickPopularityButton();
        Assert.assertEquals(CategoriesPage.getAttributeOfBlueDuck(), expectedResult);
    }
}
