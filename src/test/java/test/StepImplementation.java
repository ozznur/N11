package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import page.LoginPage;
import page.SearchPage;

import static constants.Constant.*;

public class StepImplementation extends BaseTest {

    LoginPage loginPage;
    SearchPage searchPage;

    @Step("n11 e git")
    public void homepage() {
        loginPage = new LoginPage(getWebDriver());
        searchPage = new SearchPage(getWebDriver());
    }

    @Step("Giriş yap butonuna tıkla")
    public void loginClick() {
        loginPage.click(LOG_IN);

    }

    @Step("Email <email> girin")
    public void emailEnter(String email) {
        loginPage.sendEmail(email);
    }

    @Step("Şifre  <qwerty1> girin")
    public void passwordEnter(String password) {
        loginPage.sendPassword(password);
    }


    @Step({"Arama icona tıklandı"})
    public void clickSearch() {
        searchPage.searchClick();
    }

    @Step("Giriş yapa tıkla")
    public void click() {
        loginPage.clickButton();
    }

    @Step("aramaya <text> yazıldı ve arama iconuna tıklandı")
    public void searchEnterText(String text) {
        searchPage.searchEnterText(text);
    }

}


