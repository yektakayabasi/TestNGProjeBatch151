package tests.day27_SmokeTestExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;

public class C03_BlueRentalExcelTest {
    @Test
    public void test01() {
        //Bluerentalcar adresine gidelim
        Driver.getDriver().get(ConfigReader.getProperties("blueRentalUrl"));
//mysmoketestdata excel dosyasındaki herhangi bir email ve password ile login olalım
        ExcelReader reader = new ExcelReader("src/test/java/techproed/resources/mysmoketestdata.xlsx","customer_info");
String email = reader.getCellData(2,0);
String password = reader.getCellData(2,1);
        BlueRentalPage rentalPage = new BlueRentalPage();
        Driver.getDriver().findElement(By.xpath("//*[@role='button']")).click();
        WebElement myEmail=Driver.getDriver().findElement(By.xpath("//*[@name='email']"));
        myEmail.sendKeys(email);
        WebElement myPass =Driver.getDriver().findElement(By.xpath("//*[@name='password']"));
        myPass.sendKeys(password);
        Driver.getDriver().findElement(By.xpath("//*[@type='submit']")).click();
        //login olduğumuzu doğrulayalım

//sayfayı kapatalım
    }
}
