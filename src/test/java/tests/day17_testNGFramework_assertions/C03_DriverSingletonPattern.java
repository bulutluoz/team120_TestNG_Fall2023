package tests.day17_testNGFramework_assertions;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_DriverSingletonPattern {

    @Test
    public void test01(){

        /*
            POM kapsaminda
            locate'ler, test datalari ve WebDriver'i dinamiklestirdik
            hepsinin POM tarafindan belirlenen erisim sekilleri var

            ornegin locate'lere obje olusturarak, webDriver'a ise static yolla ulasiyoruz

            POM dizayn edenler Driver class'indan obje olusturularak
            WebDriver kullanimini engellemek icin
            Singleton Pattern kullanmislar

            Singleton Pattern bir class'dan obje olusturulmasini
            engelleyen yontemlerden birisi

            Singleton pattern default constructor'i gorunur yapip
            access modifier'ini private yaparak
            constructor'a erisimi, dolayisiyla da obje olusturmayi engeller



        Driver driver = new Driver();
        driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        ReusableMethods.bekle(3);

        driver.closeDriver();

        */
    }
}
