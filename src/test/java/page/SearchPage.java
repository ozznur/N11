package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import static constants.Constant.*;
public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public void searchEnterText(String searchText){
        sendKeys(INPUT,searchText);
        searchClick();
    }

    public void searchClick(){
        click(SEARCH);
    }

}
