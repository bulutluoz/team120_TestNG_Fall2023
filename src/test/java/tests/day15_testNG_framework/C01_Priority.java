package tests.day15_testNG_framework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_Priority {

    int a = 20;
    int b = 10;

    @Test (priority = -5)
    public void carpmaTesti(){

        // sayilarin carpiminin 100'den buyuk oldugunu test edin

        Assert.assertTrue(a*b>100);
    }

    @Test
    public void toplamaTesti(){
        // sayilarin toplaminin pozitif bir sayi oldugunu test edin

        Assert.assertTrue((a+b) > 0);
    }

    @Test
    public void cikarmaTesti(){

        // a ile b'nin farkinin mutlak degerinin 100'den kucuk oldugunu test edin

        Assert.assertTrue((a-b)>-100 && (a-b)<100);
    }
}

/*
    TestNG hicbir mudahale olmazsa
    testleri isim sirasina gore calistirir

    testlerin calisma siralamasini istedigimiz sekilde duzenleyebiliriz

    testlere verecegimiz priority degerlerinden
    kucukten buyuge dogru calistirir

    priority atamazsak TestNG default olarak priority= 0 alir

    ayni priority degerine sahip, birden fazla test method'u varsa
    bunlar kendi icerisinde isim sirasina gore calisir

 */