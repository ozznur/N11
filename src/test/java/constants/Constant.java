package constants;

import org.openqa.selenium.By;

public class Constant {
    public static String WEBLINK = "https://www.n11.com/";
    public static final By LOG_IN = By.className("btnSignIn");  // giriş yap alanına tıklama locator ı
    public static final By EMAIL =By.id("email"); // giriş için mail alanı
    public static final By PASSWORD = By.id("password"); // giriş için şifre alanı
    public static final By LOG_IN_BUTTON = By.id("loginButton"); // giriş yap butonu
    public static final By INPUT = By.xpath("//*[@id='searchData']"); // search bar. ürün aratmak için
    public static final By SEARCH = By.xpath("//*[@id='header']/div/div/div[2]/div[1]/a"); // arama butonu
}
