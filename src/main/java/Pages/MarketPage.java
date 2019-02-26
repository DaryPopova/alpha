package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketPage {
    public MarketPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@class ='n-w-tab__control-caption']")
    WebElement electronic;


    public WebElement getElectronic() {
        return electronic;
    }
}
