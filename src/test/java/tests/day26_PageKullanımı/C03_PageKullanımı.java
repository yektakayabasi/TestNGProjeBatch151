package tests.day26_PageKullanımı;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.TestCenterPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C03_PageKullanımı {
    @Test
    public void test01() {
        //https://testcenter.techproeducation.com/index.php?page=form-authentication
        Driver.getDriver().get(ConfigReader.getProperties("testCenterUrl"));
//Page object Model kullanarak sayfaya giriş yapildigini test edin
        TestCenterPage centerPage = new TestCenterPage();
        centerPage.username.sendKeys(ConfigReader.getProperties("techproUs"));
        centerPage.password.sendKeys(ConfigReader.getProperties("techproPas"));
        centerPage.submit.click();
        ReusableMethods.bekle(5);

        Assert.assertTrue(centerPage.verify.isDisplayed());
//Sayfadan cikis yap ve cikis yapildigini test et
    }
}
