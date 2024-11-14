package staticPageObject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoriesPageTest extends TestBase {

    @Test // этот тест уже невалидный
    public void checkThatBlueDuckIsTheMostPopularOne () {
        String expectedResult = "Blue Duck";
        HomePage.openRubberDucksTab(driver);
        CategoriesPage.clickPopularityButton(driver);
        Assert.assertEquals(CategoriesPage.getAttributeOfBlueDuck(driver), expectedResult);
    }
}
