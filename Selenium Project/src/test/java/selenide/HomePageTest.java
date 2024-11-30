package selenide;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Home Page")
public class HomePageTest extends TestBase {

    @Story("Open home page")
    @Description("Check that user is navigated to the Home Page after clicking home button")
    @Test
    public void openHomePage() {
        HomePage.clickHomeButton();
        Assert.assertEquals(HomePage.getHomePageTitle(), "Online Store | My Store");
    }

    @Story("Open Rubber Ducks tab")
    @Description("Check that user is navigated to the Rubber Ducks tab after clicking Rubber Ducks tab")
    @Test
    public void openRubberDucksTab () {
        HomePage.openRubberDucksTab();
        Assert.assertEquals(CategoriesPage.getRubberDuckTabTitle(), "Rubber Ducks | My Store");
    }

    @Story("Open Subcategory tab")
    @Description("Check that user is navigated to the subcategory tab after clicking it")
    @Test
    public void openSubcategoryTab() {
        HomePage.hoverOverRubberDucksTab();
        HomePage.clickSubcategoryTab();
        SubcategoryPage.subcategoryHeaderIsDisplayed();
    }
}

