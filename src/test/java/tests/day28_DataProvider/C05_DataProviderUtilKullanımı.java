package tests.day28_DataProvider;

import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtil;

public class C05_DataProviderUtilKullanımı {
    @Test(dataProvider = "sehirverileri",dataProviderClass = DataProviderUtil.class)
    public void test01(String sehir,String bolge, String plaka) {
        System.out.println(sehir + bolge+ plaka);
    }
}
