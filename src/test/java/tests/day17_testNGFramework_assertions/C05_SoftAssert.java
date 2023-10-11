package tests.day17_testNGFramework_assertions;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_SoftAssert {
    /*
        TestNG assertion konusunda da bize bir alternatif sunar

        TestNG iki farkli Assertion class'ina sahiptir

        1- Assert
            Bu JUnit'teki assertion ile bire bir aynidir.
            sadece isimlendirirken diger alternatif softAssert oldugundan
            Assert class'ina da HARD ASSERT denir

            hard assert karsilastigi ilk failed'da
            calismayi durdurur, dolayisiyla geriye kalan assertion'larin
            passed veya failed sonuclarindan hangisini alacagini BILEMEYIZ
        2- Sosf Assert
           Soft Assert biz raporla diyene kadar
           yaptigi tum testlerin sonuclarini kendisi tutar
           test passed de olsa failed de olsa calismaya devam eder

           ne zaman raporla dersek
           tum failed olanlari bize rapor eder ve calismayi durdurur

           eger hic failed olan yoksa
           class calismaya devam eder

           A- softAssert objesi olustur
           B- softAssert objesi ile testleri yap, aciklama eklemekte fayda var
           C- softAssert.assertAll() diyerek tum assertipon'lari raporla
              bu satiri yazmazsak, assertion'lar FAILED olsa bile test PASSED olur
     */

    @Test
    public void softAssertionTesti(){
        // amazon anasayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        // url'in amazon icerdigini test edelim
        String expectedIcerik = "amazon";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualUrl.contains(expectedIcerik),"url amazon icermiyor");
        // aranacak kelimeyi aratalim
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);

        // sonuclarin aranacak kelimeyi icerdigini test edelim

        String expectedSonucIcerik = ConfigReader.getProperty("amazonAranacakKelime");
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();
        softAssert.assertTrue(actualSonucYazisi.contains(expectedSonucIcerik),"arama sonuclari istenen kelimeyi icermiyor");

        // ilk urune tiklayalim
        amazonPage.ilkUrunElementi.click();
        // ilk urun isminde aranacak kelime bulundugunu test edelim

        String expectedUrunIcerik = ConfigReader.getProperty("amazonAranacakKelime");
        String actualIsim = amazonPage.ilkUrunIsimElementi.getText();

        softAssert.assertTrue(actualIsim.contains(expectedUrunIcerik),"ilk urun ismi aranan kelimeyi icermiyor");
        softAssert.assertAll();
        System.out.println("Failed olan varsa bu satir calismaz");

        // sayfayi kapatalim
        Driver.closeDriver();

    }
}
