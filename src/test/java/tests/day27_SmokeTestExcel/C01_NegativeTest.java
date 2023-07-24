package tests.day27_SmokeTestExcel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C01_NegativeTest {
    @Test
    public void test01() {
        //Description:
//Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali
//Acceptance Criteria
//Customer email: fake@bluerentalcars.com
//Customer password: fakepass
//Error:
//User with email fake@bluerentalcars.com not found

        //BlueRental sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperties("blueRentalUrl"));

        //Login butonuna tıklayınız
        BlueRentalPage rentalPage = new BlueRentalPage();
        rentalPage.login.click();
        ReusableMethods.bekle(2);
        rentalPage.email.sendKeys(ConfigReader.getProperties("fakeEmail"),Keys.TAB,
                ConfigReader.getProperties("fakePassword"), Keys.ENTER);
        //Hata mesajının görünür olduğunu doğrula
       // ReusableMethods.visibleWait(rentalPage.mesajVerify,5);
       // Assert.assertTrue(rentalPage.mesajVerify.isDisplayed());

        //Sayfayı kapatınız
        Driver.closeDriver();





    }


}
