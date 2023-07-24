package tests.day26_PageKullanımı;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.pages.OpenSourcePageClass;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_PageKullanımı {
    @Test
    public void test01() {
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        Driver.getDriver().get(ConfigReader.getProperties("openSourceUrl"));
        //Username : Admin
        //Password : admin123

        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim
        OpenSourcePageClass.userName().sendKeys(ConfigReader.getProperties("OpenSourceusername"));
        OpenSourcePageClass.password().sendKeys(ConfigReader.getProperties("OpenSourcepassword"));
        OpenSourcePageClass.submit().click();

        //Login Testinin basarili oldugunu test et
        Assert.assertTrue(OpenSourcePageClass.verify().isDisplayed());

        //Sayfayı kapatınız
        Driver.closeDriver();







    }
}
