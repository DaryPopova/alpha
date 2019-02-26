package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePage {
    public MobilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type ='checkbox' and @name = 'Производитель Samsung']")
    WebElement checkboxSamsung;


    public WebElement getCheckboxSamsung() {
        return checkboxSamsung;
    }

    public void clickCheckBox(WebElement webElement) {
        webElement.click();
    }
}
