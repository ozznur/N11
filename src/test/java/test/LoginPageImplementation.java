package base;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import page.LoginPage;

import static constants.Constant.*;

public class LoginPageImplementation extends BaseTest {

    LoginPage loginPage;

    @Step("n11 e git")
    public void homepage() {
        loginPage = new LoginPage(getWebDriver());
    }

    @Step("Giriş yap butonuna tıkla")
    public void loginClickHomepage() {
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

    @Step("Giriş yapa tıkla")
    public void loginClick() {
        loginPage.click(LOG_IN_BUTTON);
    }

    @Step("Ürün <urun> girin")
    public void sendProduct(String urun) {
        loginPage.sendKeys(SEARCH_AREA, "Buzdolabı");
    }

    @Step("Ürün ara butonuna tıkla")
    public void searchProductButton() {
        loginPage.click(SEARCH_BUTTON);
    }

    @Step("Bir <Buzdolabı> seçin")
    public void selectProduct(Object arg0) {
        loginPage.click(SELECT_PRODUCT);
    }

    @Step("Favorilere ekle")
    public void addFavorites() {
        loginPage.click(WISH_BUTTON);
    }

    @Step("Favorilere ekle butonuna tıkla")
    public void addFavoritesButton() {
        loginPage.click(ADD_FAVORITES);
    }
}
