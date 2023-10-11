package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroAppPage {

    public ZeroAppPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="signin_button")
    public WebElement ilkSignInButonu;

    @FindBy(id="user_login")
    public WebElement loginKutusu;

    @FindBy(id = "user_password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement signInButonu;

    @FindBy(xpath = "//strong[text()='Online Banking']")
    public WebElement onlineBankingLinki;

    @FindBy(xpath = "//span[@id='pay_bills_link']")
    public WebElement payBillsLinki;

    @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
    public WebElement purchaseFCurrencyElementi;

    @FindBy(id = "pc_currency")
    public WebElement pcCurrencyDropdown;
}
