package tests.day24__Priority_DpendsOnMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_Priority {
WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test(priority = 1)
    public void amazonTest() {
        driver.get("https://www.amazon.com");
    }

    @Test
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