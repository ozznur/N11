package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.Constant.*;

public class MarketPage extends BasePage {
    public MarketPage(WebDriver driver) {
        super(driver);
    }

    WebDriver driver = null;

    public MarketPage moveToLogin() {
        click(MARKET);
        return this;
    }

    public void sendProduct(String urunAdi) {
        sendKeys(URUN, urunAdi);
        searchClick();
    }


    public void searchClick() {
        click(SEARCH_MARKET);
    }

}