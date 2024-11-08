import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestClass {
    @Test
    public void clickElement() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        allLinks.get(10).click();
        driver.quit();
    }

    @Test
    public void openHomePage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/rubber-ducks-c-1/");
        WebElement home = driver.findElement(By.cssSelector("[class='fa fa-home'][title='Home']"));
        home.click();
        Assert.assertEquals(driver.getTitle(), "Online Store | My Store");
        driver.quit();
    }

    @Test
    public void openRubberDucksTab() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        WebElement rubberDucksTab = driver.findElement(By.cssSelector("[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/']"));
        rubberDucksTab.click();
        Assert.assertEquals(driver.getTitle(), "Rubber Ducks | My Store");
        driver.quit();
    }

    @Test
    public void openSubcategoryTab() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        WebElement rubberDucksTab = driver.findElement(By. cssSelector("[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(rubberDucksTab).perform();
        WebElement subcategoryTab = driver.findElement(By.xpath("//li[@class='category-2']" +
                "/a[@href='https://litecart.stqa.ru/en/rubber-ducks-c-1/subcategory-c-2/']"));
        subcategoryTab.click();
        WebElement subcategoryHeader = driver.findElement(By.xpath("//h1[@class='title']"));
        Assert.assertTrue(subcategoryHeader.isDisplayed());
        driver.quit();
    }

    @Test
    public void rightClickTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement button = driver.findElement(By.cssSelector("[class='context-menu-one btn btn-neutral']"));
        Actions builder = new Actions(driver);
        builder.contextClick(button).perform();
    }

    @Test
    public void dragAndDropTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.javascript.ru/article/mouse-drag-and-drop/ball4/");
        WebElement ball = driver.findElement(By.id("ball"));
        WebElement goal = driver.findElement(By.id("gate"));
        Actions builder = new Actions(driver);
        builder.dragAndDrop(ball, goal).perform();
    }

    // дз 04/11
    @Test
    public void checkThatErrorIsShownAfterEnteringInvalidEmail() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        WebElement emailAddressField = driver.findElement(By.cssSelector("input[type='text']"));
        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[name='login']"));
        emailAddressField.sendKeys("123");
        passwordField.sendKeys("sasha123");
        loginButton.click();
        WebElement noticeError = driver.findElement(By.xpath("//*[normalize-space(text())='Wrong password " +
                "or the account is disabled, or does not exist']"));
        Assert.assertTrue(noticeError.isDisplayed());
        driver.quit();
    }

    @Test
    public void checkThatCreateAccountPageIsOpenedAfterClickingNewCustomersButton () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        WebElement newCustomersButton = driver.findElement(By.xpath("//a[@href='https://litecart.stqa.ru/en/create_account']" +
                "[text()='New customers click here']"));
        newCustomersButton.click();
        WebElement newPage = driver.findElement(By.id("create-account"));
        Assert.assertTrue(newPage.isDisplayed());
        driver.quit();
    }

    @Test
    public void checkThatCartIconIsChangedAfterAddingItem() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        WebElement redDuck = driver.findElement(By.cssSelector("a.link[title='Red Duck']"));
        redDuck.click();
        WebElement addToCartButton = driver.findElement(By.cssSelector("button[name='add_cart_product']"));
        addToCartButton.click();
        WebElement cartItems = (new WebDriverWait(driver, Duration.ofSeconds(4))).
                until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//img[@src='/includes/templates/default.catalog/images/cart_filled.png']")));
        Assert.assertTrue(cartItems.isDisplayed());
        driver.quit();
    }

    @Test
    public void checkThatTotalPriceCorrectlyChangesAfterChangingItemQuantity () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        WebElement redDuck = driver.findElement(By.cssSelector("a.link[title='Red Duck']"));
        redDuck.click();
        WebElement addToCartButton = driver.findElement(By.cssSelector("button[name='add_cart_product']"));
        addToCartButton.click();
        WebElement cartItems = (new WebDriverWait(driver, Duration.ofSeconds(4))).
                until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//img[@src='/includes/templates/default.catalog/images/cart_filled.png']")));
        WebElement checkoutButton = driver.findElement(By.cssSelector("a.link[href='https://litecart.stqa.ru/en/checkout']"));
        checkoutButton.click();
        WebElement inputField = driver.findElement(By.cssSelector("input[type='number']"));
        inputField.sendKeys("1");
        WebElement updateButton = driver.findElement(By.cssSelector("button[type='submit'][name='update_cart_item']"));
        updateButton.click();
        WebElement totalAmount = (new WebDriverWait(driver, Duration.ofSeconds(4))).
                until(ExpectedConditions.presenceOfElementLocated
                        (By.xpath("//strong[text()=\"$220.00\"]")));
        String expectedValue = "$220.00";
        Assert.assertEquals(totalAmount.getText(), expectedValue);
        driver.quit();
    }

    @Test
    public void checkThatBlueDuckIsTheMostPopularOne () {
        WebDriver driver = new ChromeDriver();
        driver.get("https://litecart.stqa.ru/en/");
        WebElement rubberDucksTab = driver.findElement(By.cssSelector("[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/']"));
        rubberDucksTab.click();
        WebElement popularityButton = driver.findElement(By.cssSelector
                ("a.button[href='https://litecart.stqa.ru/en/rubber-ducks-c-1/?category_id=1&page=1&sort=popularity']"));
        popularityButton.click();
        WebElement blueDuck = driver.findElement(By.cssSelector("ul[class='listing-wrapper products']>li>a"));
        String expectedResult = "Blue Duck";
        Assert.assertEquals(blueDuck.getAttribute("title"), expectedResult);
        driver.quit();
    }
}
