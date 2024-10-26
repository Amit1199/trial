package MyTestPackage;

import BasePackage.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPagetest extends BaseTest {

    @Test(priority = 1)
    public void loginPageTitleTest(){
        Assert.assertEquals(driver.getTitle(),"Account Login");
    }

    @Test(priority = 2)
    public void loginPageLogoTest(){
        Assert.assertEquals(driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed(),true);
    }
}
