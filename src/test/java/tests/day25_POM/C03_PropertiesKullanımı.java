package tests.day25_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C03_PropertiesKullanımı {
    @Test
    public void AmazonTest() {
        //amazon sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperties("amazonurl"));
        // başlığın amazon içerdiğini test edelim
        String actualTitle = Driver.getDriver().getTitle();
        String expextedTitle =ConfigReader.getProperties("expectedTitle");
        Assert.assertTrue(actualTitle.contains(expextedTitle));
        //Arama kutusunda iphone aratalım.
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys(ConfigReader.getProperties("searchText"), Keys.ENTER);
        //Sayfası kapatalım
        Driver.closeDriver();
        //Google sayfasına gidelm
        Driver.getDriver().get(ConfigReader.getProperties("googeleurl"));

        //Kapatalım
        Driver.closeDriver();
    }
}
