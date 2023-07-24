package tests.day28_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C06_DataProvider {

    @DataProvider
    public static Object[][] veriler() {
        return new Object[][]{{"esen"},{"mehmet"},{"esma"},{"ali"},{"mert"},{"burcu"},{"yunus"}};
    }

    @Test(dataProvider = "veriler")
    public void test01(String data) {
        System.out.println(data);
    }

    @Test(dataProvider = "veriler")
    public void test02() {
    }

    @Test(dataProvider = "veriler")
    public void test03() {
    }

    @Test(dataProvider = "veriler")
    public void test04() {
    }
}
