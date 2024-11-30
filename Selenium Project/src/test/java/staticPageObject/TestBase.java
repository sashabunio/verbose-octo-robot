package staticPageObject;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Browsers.CHROME;

//public class TestBase {
//
//    private static final Logger log = LoggerFactory.getLogger(TestBase.class);
//    public static WebDriver driver;
//    String baseUrl = "https://litecart.stqa.ru/en/";
//
//    @BeforeMethod
//    public void methodSetup() throws MalformedURLException {
//
//        ChromeOptions browserOptions = new ChromeOptions();
//        browserOptions.setPlatformName("Linux");
//        browserOptions.setBrowserVersion("131");
//        Map<String, Object> sauceOptions = new HashMap<>();
//        sauceOptions.put("username", "oauth-sabunioaleksandra-c4ddd");
//        sauceOptions.put("accessKey", "5e596c8d-856a-4114-9f2f-5eb86646b5fa");
//        sauceOptions.put("build", "Build nr 12345");
//        sauceOptions.put("name", "Regression");
//        browserOptions.setCapability("sauce:options", sauceOptions);
//
//        URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
//        driver = new RemoteWebDriver(url, browserOptions);
//
//        String browser = System.getProperty("browser", "chrome");
//        Platform platform = Platform.valueOf(System.getProperty("os", "LINUX"));
//
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setPlatform(platform);
//        caps.setBrowserName(browser);
////        caps.setVersion("120");
//
//        driver = switch (browser) {
//            case "chrome" -> new ChromeDriver();
//            case "edge" -> new EdgeDriver();
//            default -> new ChromeDriver();
//        };
//
//        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
//        driver.get(baseUrl);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//    }
//
//    @AfterMethod
//    public void methodTearDown () {
//        driver.quit();
//    }
//}
