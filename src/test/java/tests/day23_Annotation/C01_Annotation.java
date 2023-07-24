package tests.day23_Annotation;

import org.testng.annotations.*;

public class C01_Annotation {
    @BeforeSuite
    public void suite() {
        System.out.println("Herseyden önce bir kez çalışır.");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("Her testten önce bir kez çalışır");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("Her classtan önce bir kez çalışır");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Junitteki @Before gibi her methoddan önce çalışır.");
    }
    @Test
    public void test1(){
        System.out.println("Test1 Çalıştı");
    }
    @Test
    public void test2(){
        System.out.println("Test2 Çalıştı");
    }
    @Test
    public void test3(){
        System.out.println("Test3 Çalıştı");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("Her seyden sonra AfterSuite bir kez calisir");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("Her testten sonra bir kez AfterTest calisir");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Her Class'tan sonra AfterClass bir kez calisir");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Junitteki @After notasyonu gibi her methottan sonra calisir");
    }

}
