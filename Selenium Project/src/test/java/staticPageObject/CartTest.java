//package staticPageObject;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class CartTest extends TestBase {
//
//    @Test
//    public static void checkThatCartIconIsChangedAfterAddingItem() {
//        HomePage.clickRedDuck(driver);
//        RedDuckProfile.clickAddToCartButton(driver);
//        CartSummary.waitUntilAmountIsUpdated(driver, "//img[@src='/includes/templates/default.catalog/images/cart_filled.png']");
//        Assert.assertTrue(CartSummary.cartItemIsDisplayed(driver));
//    }
//
//    @Test
//    public void checkThatTotalPriceCorrectlyChangesAfterChangingItemQuantity() {
//        HomePage.clickRedDuck(driver);
//        RedDuckProfile.clickAddToCartButton(driver);
//        CartSummary.waitUntilAmountIsUpdated(driver, "//img[@src='/includes/templates/default.catalog/images/cart_filled.png']");
//        CartSummary.clickCheckoutButton(driver);
//        OrderPage.clearInputField(driver);
//        OrderPage.enterDuckQuantity(driver, "2");
//        OrderPage.clickUpdateButton(driver);
//        OrderPage.waitUntilPageIsUpdating(driver, "//strong[text()=\"$40.00\"]");
//        Assert.assertEquals(OrderPage.getTotalAmountText(driver), "$40.00");
//    }
//}