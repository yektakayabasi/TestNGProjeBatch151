package tests.day28_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C02_DataProviderTest {
    @DataProvider
    public static Object[][] arabalar() {
        return new Object[][]{{"Volvo"},{"Audi"},{"Mercedes"},{"Audi"}};
    }

    /*
    Google sayfasına gidip belirtilen araç simlerini aratalım
     */


    @Test(dataProvider = "arabalar")
    public void test01(String araclar) {
        //Google sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperties("googeleurl"));
        //Dataproviderdaki veriler arama yapalım.
        Driver.getDriver().findElement(By.xpath("//*[.='Tümünü kabul et']")).click();
        GooglePage googlePage = new GooglePage();
        googlePage.aramaKutusu.sendKeys(araclar, Keys.ENTER);

        //Resimlerini alalım
        ReusableMethods.tumSayfaResmi();

        Driver.closeDriver();//Bunu unuttuğum için kapatmadı
    }
}
