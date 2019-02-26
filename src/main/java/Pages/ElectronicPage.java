package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Pages.StepDefinitions.driver;

public class ElectronicPage extends BasePage {

    public ElectronicPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class ='_2qvOOvezty _2x2zBaVN-3 _9qbcyI_fyS']")
    WebElement mobiles;


    public WebElement getMobiles() {
        return mobiles;
    }

    @Override
    public void putIntoSubsection(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 5000);
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
    }
}