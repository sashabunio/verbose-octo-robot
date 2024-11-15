package selenide;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    @Test
    public void openHomePage() {
        HomePage.clickHomeButton();
        Assert.assertEquals(HomePage.getHomePageTitle(), "Online Store | My Store");
    }

    @Test
    public void openRubberDucksTab () {
        HomePage.openRubberDucksTab();
        Assert.assertEquals(CategoriesPage.getRubberDuckTabTitle(), "Rubber Ducks | My Store");
    }

    @Test
    public void openSubcategoryTab() {
        HomePage.hoverOverRubberDucksTab();
        HomePage.clickSubcategoryTab();
        SubcategoryPage.subcategoryHeaderIsDisplayed();
    }
}

