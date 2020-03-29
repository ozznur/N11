package test;

import base.BaseTest;
import com.thoughtworks.gauge.Step;
import page.LoginPage;

import static constants.Constant.LOG_IN;
import static constants.Constant.LOG_IN_BUTTON;

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

}