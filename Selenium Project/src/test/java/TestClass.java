import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

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
}
