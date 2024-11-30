package selenide;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Cart Page")
public class CartTest extends TestBase {

    @Story("Check that cart icon is changed after adding item")
    @Description("When user adds item to the cart, the cart icon should be changed")
    @Test
    public static void checkThatCartIconIsChangedAfterAddingItem() {
        HomePage.clickRedDuck();
        RedDuckProfile.clickAddToCartButton();
        CartSummary.cartItemIsDisplayed();
    }

    @Description("When user changes the amount of items in the cart and hit Checkout button, the total price should be updated")
    @Test
    public void checkThatTotalPriceCorrectlyChangesAfterChangingItemQuantity() {
        HomePage.clickRedDuck();
        RedDuckProfile.clickAddToCartButton();
        CartSummary.cartItemIsDisplayed();
        CartSummary.clickCheckoutButton();
        OrderPage.clearInputField();
        OrderPage.enterDuckQuantity("2");
        OrderPage.clickUpdateButton();
        OrderPage.getTotalAmountText("$40.00");
    }
}