package tests.day19_testNGreports_crossBrowserTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_RaporluNegatifLoginTesti extends TestBaseRapor {

    QualitydemyPage qualitydemyPage;


    @Test
    public void gecersizPasswordTest(){
        extentTest = extentReports.createTest("gecersiz Password Test","Kullanici gecersiz password ve gecerli username ile giris yapamamali");
        Driver.getDriver().get("https://www.qualitydemy.com/");
        extentTest.info("Kullanici qualitydemy anasayfasina gider");

        qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        extentTest.info("ilk sayfadaki login linkine tiklar");

        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        extentTest.info("Username olarak gecerli username yazar");
        qualitydemyPage.passwordKutusu.sendKeys("12345");
        extentTest.info("password olarak gecersiz password yazar");
        qualitydemyPage.loginButonu.click();
        extentTest.info("login butonuna basar");
        ReusableMethods.bekle(1);
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        extentTest.pass("giris yapilamadigini test eder");
        Driver.closeDriver();
        extentTest.info("sayfayi kapatir");
    }

    @Test
    public void gecersizEmailTesti(){
        extentTest = extentReports.createTest("gecersiz Email Test","Kullanici gecerli password ve gecersiz username ile giris yapamamali");

        Driver.getDriver().get("https://www.qualitydemy.com/");
        extentTest.info("Kullanici qualitydemy anasayfasina gider");
        qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        extentTest.info("ilk sayfadaki login linkine tiklar");
        qualitydemyPage.emailKutusu.sendKeys("alican@gmail.com");
        extentTest.info("Username olarak gecersiz username yazar");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");
        extentTest.info("password olarak gecerli password yazar");
        qualitydemyPage.loginButonu.click();
        extentTest.info("login butonuna basar");
        ReusableMethods.bekle(1);
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        extentTest.pass("giris yapilamadigini test eder");
        Driver.closeDriver();
        extentTest.info("sayfayi kapatir");
    }

    @Test
    public void gecersizEmailPasswordTesti(){
        extentTest = extentReports.createTest("gecersiz email ve Password Test","Kullanici gecersiz password ve gecersiz username ile giris yapamamali");

        Driver.getDriver().get("https://www.qualitydemy.com/ ");
        extentTest.info("Kullanici qualitydemy anasayfasina gider");
        qualitydemyPage= new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();
        extentTest.info("ilk sayfadaki login linkine tiklar");
        qualitydemyPage.emailKutusu.sendKeys("alican@gmail.com");
        extentTest.info("Username olarak gecersiz username yazar");
        qualitydemyPage.passwordKutusu.sendKeys("12345");
        extentTest.info("password olarak gecersiz password yazar");
        qualitydemyPage.loginButonu.click();
        extentTest.info("login butonuna basar");
        ReusableMethods.bekle(1);
        Assert.assertTrue(qualitydemyPage.emailKutusu.isDisplayed());
        extentTest.pass("giris yapilamadigini test eder");
        Driver.closeDriver();
        extentTest.info("sayfayi kapatir");
    }
}
