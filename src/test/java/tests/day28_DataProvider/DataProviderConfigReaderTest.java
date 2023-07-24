package tests.day28_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class DataProviderConfigReaderTest {
    @DataProvider
    public static Object[][] blueRental() {
        return new Object[][]{{ConfigReader.getProperties("mail1"),ConfigReader.getProperties("sifre1")},
                              {ConfigReader.getProperties("mail2"),ConfigReader.getProperties("sifre2")},
                              {ConfigReader.getProperties("mail3"),ConfigReader.getProperties("sifre3")},
                              {ConfigReader.getProperties("mail4"),ConfigReader.getProperties("sifre4")}};
    }

    @Test(dataProvider = "blueRental")
    public void test01(String mail,String password) {

        Driver.getDriver().get(ConfigReader.getProperties("blueRentalUrl"));
        Driver.getDriver().findElement(By.xpath("//*[@role='button']")).click();

        BlueRentalPage blueRentalPage = new BlueRentalPage();
        Driver.getDriver().findElement(By.xpath("//*[@name='email']")).sendKeys(mail);
        Driver.getDriver().findElement(By.xpath("//*[@name='password']")).sendKeys(password,Keys.ENTER);
        ;


    }
}
