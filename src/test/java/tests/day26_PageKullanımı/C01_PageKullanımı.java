package tests.day26_PageKullanımı;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C01_PageKullanımı {
    @Test
    public void test01() {

        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim
        Driver.getDriver().get(ConfigReader.getProperties("opensource"));
        //kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim
        OpenSourcePage sourcePage= new OpenSourcePage();
        sourcePage.userName.sendKeys(ConfigReader.getProperties("Username"));
        sourcePage.password.sendKeys(ConfigReader.getProperties("Password"));
        sourcePage.submitButton.click();
        //Username : Admin
        //Password : admin123
        //Login Testinin basarili oldugunu test et
        Assert.assertTrue(sourcePage.verify.isDisplayed());

        //sayfayı kapatınız
        Driver.closeDriver();

    }
}
