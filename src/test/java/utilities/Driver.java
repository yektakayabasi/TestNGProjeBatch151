package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    /*
POM(Page Object Model)
       Test seneryolarının daha az kod ile yazılmasına ve bakımının daha kolay yapılmasına
   olanak sağlayan yazılım test yöntemidir. TestNG ve Cucumber frameworklerinde POM kalıbı kullanılır.
 */
    private Driver(){
        /*
      Driver class'ından obje oluşturmanın önüne geçebilmek için
    default constructor'ı private yaparak bunu engellemiş oluruz.
    Bu kalıba da Singleton patter denir.

      */

    }
    static WebDriver driver;
    public static WebDriver getDriver(){
     if (driver==null){
    WebDriverManager.chromedriver().setup();
    driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

      }
             /*
            Driver 'i her cagirdigimizda yeni bir pencere acilmasinin onune gecmek icin
         if blogu icinde Eger driver'a deger ATANMAMISSA deger ata, eger deger atanmamissa
         Driver'i ayni sayfada return et.
           */


        return driver;
    }
    public static void closeDriver(){
        if (driver != null){ //Drivera değer atanmışşsa boş değilse
            driver.close();
            driver = null; // Driverı boşl
        }

        }
    public static void quitDriver(){
        if (driver != null){ //Drivera değer atanmışşsa boş değilse
            driver.quit();
            driver = null; // Driverı boşl
        }

    }

    }



