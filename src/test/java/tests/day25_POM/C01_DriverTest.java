package tests.day25_POM;

import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class C01_DriverTest {
    @Test
    public void test01() {
        Driver.getDriver().get("https://amazon.com");
        Driver.closeDriver();
    }

    @Test
    public void test02() {
        Driver.getDriver().get("https://amazon.com");
        Driver.getDriver().get("https://youtube.com");
        Driver.closeDriver();
        Driver.getDriver().get("https://facebook.com");
    }

    @Test
    public void test03() {
     //   Driver driver = new Driver(); izin vermedi Default construcotırı private yaptık
    }
}
