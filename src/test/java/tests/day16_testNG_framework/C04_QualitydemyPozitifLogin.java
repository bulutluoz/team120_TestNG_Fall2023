package tests.day16_testNG_framework;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C04_QualitydemyPozitifLogin {

    @Test
    public void pozitifLoginTesti(){

        //1- https://www.qualitydemy.com/ anasayfasina gidin
        Driver.getDriver().get("https://www.qualitydemy.com/");
        //2- login linkine basin
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        //3- Kullanici email'i olarak valid email girin
        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        //4- Kullanici sifresi olarak valid sifre girin
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");
        //5- Login butonuna basarak login olun
        qualitydemyPage.loginButonu.click();
        //6- Basarili olarak giris yapilabildigini test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisElementi.isDisplayed());

        Driver.closeDriver();

    }
}
