package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    /*
     JUnit'de WebDriver objesi TestBase'den geliyordu

     TestNG extends ile baglanma zorunlulugunu ortadan kaldirmak
     ve testi yazanlara daha fazla kontrol imkani vermek icin
     TestBase yerine Driver class'inda static 2 method ile
     driver olusturma ve kapatma islemlerini yapmayi tercih etmistir
     */
    static WebDriver driver;
    public static WebDriver getDriver(){

        WebDriverManager.chromedriver().setup();

        if (driver == null){
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }


    public static void closeDriver(){
        if (driver != null){
            driver.close();
            driver=null;
        }
    }

}
