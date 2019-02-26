package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static Pages.StepDefinitions.driver;

public class SearchPage extends BasePage {

    SearchPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public boolean textSearchOnPage(String textToSearch) {
        List<WebElement> allLinksOnThisPage = driver.findElements(By.partialLinkText(textToSearch));
        if(allLinksOnThisPage.size() > 0) return true;
        else return false;
    }
    public int getNumOfSearchResultPages(){
        List<WebElement> pages = driver.findElements(By.className("pager-link"));
        return pages.size()-2;
    }
}
