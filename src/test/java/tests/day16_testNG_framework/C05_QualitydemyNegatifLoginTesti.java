package tests.day16_testNG_framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C05_QualitydemyNegatifLoginTesti {

    QualitydemyPage qualitydemyPage;

    @Test(groups = {"smoke","regression"})
    public void gecersizPasswordTest(){

        Driver.getDriver().get("https://www.qualitydemy.com/");

        qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("12345");
        qualitydemyPage.loginButonu.click();

        ReusableMethods.bekle(1);
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());

        Driver.closeDriver();
    }

    @Test(groups = {"smoke","e2e1"})
    public void gecersizEmailTesti(){
        Driver.getDriver().get("https://www.qualitydemy.com/");

        qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.emailKutusu.sendKeys("alican@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");
        qualitydemyPage.loginButonu.click();

        ReusableMethods.bekle(1);
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        Driver.closeDriver();
    }

    @Test(groups = {"e2e1","regression"})
    public void gecersizEmailPasswordTesti(){
        Driver.getDriver().get("https://www.qualitydemy.com/ ");

        qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.emailKutusu.sendKeys("alican@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("12345");
        qualitydemyPage.loginButonu.click();

        ReusableMethods.bekle(1);
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        Driver.closeDriver();
    }
}
