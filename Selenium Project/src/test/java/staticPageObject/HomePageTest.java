package staticPageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    @Test
    public void openHomePage() {
        HomePage.clickHomeButton(driver);
        Assert.assertEquals(HomePage.getHomePageTitle(driver), "Online Store | My Store");
    }

    @Test
    public void openRubberDucksTab () {
        HomePage.openRubberDucksTab(driver);
        Assert.assertEquals(CategoriesPage.getRubberDuckTabTitle(driver), "Rubber Ducks | My Store");
    }

    @Test
    public void openSubcategoryTab() {
        HomePage.hoverOverRubberDucksTab(driver);
        HomePage.clickSubcategoryTab(driver);
        SubcategoryPage.subcategoryHeaderIsDisplayed(driver);
    }
}

