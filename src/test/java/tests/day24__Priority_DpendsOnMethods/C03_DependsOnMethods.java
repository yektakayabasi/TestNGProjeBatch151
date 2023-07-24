package tests.day24__Priority_DpendsOnMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class C03_DependsOnMethods {
WebDriver driver;

/*
        Test methodları birbirinden bağımsız çalışır. Methodları birbirine bağımlı çalıştırmak istersek
    DEPENDSONMETHODS parametresini @Test notasyonundan sonra bağlamak istediğimiz test methodunun adını
    yazarak belirtiriz.
     */

    @Test
    public void test01() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test(priority = 1)
    public void test02() {
        //Amazon Sayfasına gidelim
        driver.get("https://amazon.com");
    }

    @Test(priority = 2,dependsOnMethods = "test02")
    public void test03() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);

    }
}
