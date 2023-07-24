package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    /*
.properties uzantılı dosyaya erişebilmemiz için Properties class'ından obje oluşturmamız gerekir.
bu oluşturduğumuz obje ile akışa aldığımız dosya yolunu load(fis) methodu ile properties dosyasındaki
key değerini return edebiliriz .Bunu yapmak içn pRmetreli bir method oluşturu girdiğimiz keyin
değerini bize dömdürür
 */
    static Properties properties;

    public static String getProperties(String key){
        String dosyaYolu ="configuration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fis);//--fisin okuduğu değerleri yükler
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String value = properties.getProperty(key);
        return value;
    }
}
