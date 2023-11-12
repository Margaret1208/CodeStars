package AutomationTestsuite;

import AutomationCommon.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day8_Exercise extends CommonBase {
    @BeforeTest
    public void openChrome(){
        driver = initChromeDriver("https://rise.fairsketch.com");
    }

    @Test
    public void getLocation (){
        WebElement email = driver.findElement(By.id("email"));
        System.out.println ("Email element is: " + email);

        WebElement pass = driver.findElement(By.id("password"));
        System.out.println ("Pass element is: " + pass);

        WebElement btn = driver.findElement(By.className("w-100"));
        System.out.println ("Button element is: " + btn);
    }

    @AfterMethod
    public void closeChrome(){
        driver.close();
    }
}
