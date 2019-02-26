package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import java.util.logging.Logger;

public class StepDefinitions {

    private static final Logger LOGGER = Logger.getLogger(StepDefinitions.class.getName());
    public static BasePage page = new BasePage();
    public static WebDriver driver;

    public static void browserInit() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void userOpenWebPage(String url) {
        LOGGER.info("Try to open " + url + " page");
        driver.get(url);
        page = new MainPage(driver);
    }

    public void putIntoSubsection(WebElement webElement) {
        LOGGER.info("Put into subsection" + webElement.getTagName());
        ((BasePage)page).putIntoSubsection(webElement);
    }

    public void clickCheckBox(WebElement webElement) {
        webElement.click();
    }

    public static void browserClose() {
        try {
            driver.quit();
            driver = null;
            LOGGER.info("closing the browser");
        } catch (UnreachableBrowserException e) {
            LOGGER.info("cannot close browser: unreachable browser");
        }
    }
}
