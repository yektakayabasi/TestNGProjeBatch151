package tests.day25_POM;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;

public class C02_PropertiesKullanımı {
    @Test
    public void test01() {
        String amazonUrl = ConfigReader.getProperties("amazonurl");
        String userName = ConfigReader.getProperties("username");
        String password = ConfigReader.getProperties("password");
        System.out.println(amazonUrl);
        System.out.println(userName);
        System.out.println(password);
    }
}
