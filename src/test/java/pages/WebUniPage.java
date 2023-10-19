package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniPage {

    public WebUniPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Our Products")
    public WebElement ourProductLinki;

    @FindBy(xpath = "//iframe[@id='frame']")
    public WebElement iFrameElementi;

    @FindBy(xpath = "//p[text()='Cameras']")
    public WebElement camerasElementi;

    @FindBy(xpath = "//h4")
    public WebElement alertYaziElementi;

    @FindBy(xpath = "//button[text()='Close']")
    public WebElement alertKapatButonu;

    @FindBy(xpath = "(//a[@id='nav-title'])[1]")
    public WebElement webDriverLinki;
}
