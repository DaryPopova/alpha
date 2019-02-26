import Pages.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;

public class Test1 {

    @BeforeClass
    public static void setup() {
        StepDefinitions.browserInit();
    }

    @org.junit.Test
    public void test() {
        WebElement market = new MainPage(StepDefinitions.driver).getMarket();
        StepDefinitions sd = new StepDefinitions();
        sd.userOpenWebPage("https://www.yandex.ru/");
        sd.putIntoSubsection(market);
        WebElement electronic = new MarketPage(StepDefinitions.driver).getElectronic();
        sd.putIntoSubsection(electronic);
        WebElement mobiles = new ElectronicPage(StepDefinitions.driver).getMobiles();
        sd.putIntoSubsection(mobiles);
        WebElement checkBox = new MobilePage(StepDefinitions.driver).getCheckboxSamsung();
        sd.clickCheckBox(checkBox);


    }

    @AfterClass
    public static void tearDown() {
        StepDefinitions.browserClose();
    }
}
