package selenide;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends TestBase {

    @Test
    public static void checkThatCartIconIsChangedAfterAddingItem() {
        HomePage.clickRedDuck();
        RedDuckProfile.clickAddToCartButton();
//        CartSummary.waitUntilAmountIsUpdated();
        CartSummary.cartItemIsDisplayed();
    }

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