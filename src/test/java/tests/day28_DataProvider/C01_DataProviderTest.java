package tests.day28_DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C01_DataProviderTest {

    /*
        Dataprovider, bircok veriyi test caselerde loop kullanmadan aktarmak icin kullanilir.
    TestNG'den gelen bir ozelliktir. 2 boyutlu Object Array return eder.
    Kullanimi icin @Test notasyonundan sonra parametre olarak (dataprovider="method ismi") yazilir.
    Kac tane veri ile calisacaksak test methoduna o kadar parametre eklenir
     */
    @DataProvider(name = "test02")
    public static Object[][] isimler() {
        return new Object[][]{
                {"esen"},
                {"mehmet"},
                {"esma"},
                {"ali"},
                {"mert"},
                {"burcu"},
                {"yunus"}};
    }

    @DataProvider
    public static Object[][] arabalar() {
        return new Object[][]{{"Volvo"}, {"Mercedes"}, {"Audi"}};
    }


    @Test(dataProvider = "isimler")
    public void test01(String data) {
        System.out.println(data);
    }
    /*



     */

    @Test(dataProvider = "test02")
    public void test02(String isim) {
        System.out.println(isim);
    }
    /*
    Olusturdugumuz dataprovider methodunu baska bir test methodunda da kullanabiliriz.
    Bunun icin @DataProvider notasyonundan sonra yeni olusturdugumuz methodun ismini (name="test02") olarak
    belirtmemiz gerekir
    Data driven testing() de datalarimizi 3 farkli sekilde kullanabiliriz.
    i-).properties dosyasindan datalari alabiliriz
   ii-)Excel dosyasindan datalari alabiliriz
  iii-)DataProvider kullanarak datalari alabiliriz
     */

    @Test(dataProvider = "arabalar")
    public void test03(String arabalar) {
        System.out.println(arabalar);

    }
}
