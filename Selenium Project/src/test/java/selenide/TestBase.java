package selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.epam.reportportal.testng.ReportPortalTestNGListener;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.Browsers.EDGE;
import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

@Listeners({ReportPortalTestNGListener.class, ScreenshotListener.class})
public class TestBase {

    @BeforeMethod
    public void methodSetup() {
        String platform = System.getProperty("os", "windows");
        DesiredCapabilities caps = new DesiredCapabilities();

        switch(platform) {
            case "windows" -> caps.setPlatform(Platform.WINDOWS);
            case "linux" -> caps.setPlatform(Platform.LINUX);
        }

        enum Browser {
            chrome,
            edge
        }
        Browser browser = Browser.valueOf(System.getProperty("browser", "chrome"));
        Configuration.browser = switch (browser) {
            case chrome -> CHROME;
            case edge -> EDGE;
        };
        caps.setBrowserName(String.valueOf(browser));

        Configuration.remote="http://localhost:4444/wd/hub";
        Configuration.browserCapabilities = caps;
        open("https://litecart.stqa.ru/en/");
        Configuration.pageLoadTimeout = 5000;
        Configuration.browser = String.valueOf(browser);
        Configuration.baseUrl = "https://litecart.stqa.ru/en/";
    }
}

