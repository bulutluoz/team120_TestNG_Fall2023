package tests.day24_genelTekrar;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_IFrame {

    @Test
    public void iFrameTesti(){
        //“http://webdriveruniversity.com/IFrame/index.html” sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("webUniUrl"));
        //“Our Products” butonuna basin
        WebUniPage webUniPage = new WebUniPage();

        // click yapmak istedigimiz ourproduct linki bir iFrame icinde
        // oncelikle o iframe'i locate edip, gecis yapmaliyiz
        Driver.getDriver().switchTo().frame(webUniPage.iFrameElementi);
        ReusableMethods.bekle(1);

        webUniPage.ourProductLinki.click();
        //“Cameras product”i tiklayin
        webUniPage.camerasElementi.click();
        //Popup mesajini yazdirin

        System.out.println(webUniPage.alertYaziElementi.getText());
        //“close” butonuna basin
        webUniPage.alertKapatButonu.click();
        //"WebdriverUniversity.com (IFrame)" linkini tiklayin
        // link anasayfada once iFrame'den ana sayfaya donmeliyiz
        Driver.getDriver().switchTo().defaultContent();

        webUniPage.webDriverLinki.click();
        //"http://webdriveruniversity.com/index.html" adresine gittigini test edin

        String expectedUrl= "http://webdriveruniversity.com/index.html";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);

        ReusableMethods.bekle(3);
        Driver.closeDriver();
    }
}
