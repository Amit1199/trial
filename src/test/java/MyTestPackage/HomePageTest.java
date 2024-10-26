package MyTestPackage;

import BasePackage.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    @Test(priority = 1)
    public void isUserLoggedtest(){
        driver.findElement(By.id("input-email")).sendKeys("test8308@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("test12345");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
    }

    @Test(priority = 2)
    public void homePageSearchBoxTest(){
        Assert.assertTrue(driver.findElement(By.name("search")).isDisplayed());
    }
}
