package staticPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    static WebDriver driver;
    String baseUrl = "https://litecart.stqa.ru/en/";

    @BeforeMethod
    public void methodSetup() {
        enum Browser {
            chrome,
            edge
        }
        Browser browser = Browser.valueOf(System.getProperty("browser", "chrome"));
        driver = switch (browser) {
        case chrome -> new ChromeDriver();
        case edge -> new EdgeDriver();

//
//        String browser = System.getProperty("browser", "chrome");
//
//        driver = switch (browser) {
//            case "chrome" -> new ChromeDriver();
//            case "edge" -> new EdgeDriver();
//            default -> new ChromeDriver();
        };

        driver.get(baseUrl);
    }

    @AfterMethod
    public void methodTearDown () {
        driver.quit();
    }
}
