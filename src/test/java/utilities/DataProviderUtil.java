package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtil {
    @DataProvider
    public  static Object[][] sehirverileri() {
        return new Object[][]{{"Ankara","IcAnadolu","06"},{"Izmir","Ege","35"}};
    }
}
