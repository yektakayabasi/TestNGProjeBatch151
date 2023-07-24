package tests.day24__Priority_DpendsOnMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.time.Duration;

public class C02_Ignore {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    /*
        Birden fazla test methodu calistirmak istedigimizde o anlik gereksiz gordugumuz test methodunu
        atlamak (ignore) isteyebiliriz.Bunun icin @Test notasyonu ustune ya da yanina @Ignore notasyonu
        eklememiz yeterlidir
         */
    @Ignore
    @Test(priority = 1)
    public void amazonTest() {
        driver.get("https://www.amazon.com");
    }

    @Test(enabled = false)//Eğer böylr yaparsam tamamen heryerden çıkarır. Raporda gözükmez.
    public void youtubeTest() { //default 0 olduğu için yazmadık
        driver.get("https://www.youtube.com");//Youtube önce çalışsın
    }
    @Test(priority = 2)
    public void facebookTest() {
        driver.get("https://www.facebook.com");

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
