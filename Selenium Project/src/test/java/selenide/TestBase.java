package selenide;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.EDGE;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeMethod
    public void methodSetup() {
        Configuration.baseUrl = "https://litecart.stqa.ru/en/";
        enum Browser {
            chrome,
            edge
        }
        Browser browser = Browser.valueOf(System.getProperty("browser", "chrome"));
        Configuration.browser = switch (browser) {
        case chrome -> CHROME;
        case edge -> EDGE;
        };
        open("https://litecart.stqa.ru/en/");
    }
}
