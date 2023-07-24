package tests.day24__Priority_DpendsOnMethods;

import org.testng.annotations.Test;

public class C05_DependsOnMethod {
    @Test
    public void test01() {
        System.out.println("Test01");
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {
        System.out.println("Test02");
    }

    @Test(dependsOnMethods = "test02")
    public void test03() {
        System.out.println("Test03");
    }

    @Test(dependsOnMethods = "test03")
    public void test04() {
        System.out.println("Test04");
    }
}
