package AutomationTestsuite;

import AutomationCommon.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day8_Exercise2 extends CommonBase {
    @BeforeTest
    public void openChrome(){
        driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
    }

    @Test
    public void TestsEx(){
        WebElement email = driver.findElement(By.id("userId"));
        System.out.println ("Email element is: " + email);

        WebElement pass = driver.findElement(By.id("pass"));
        System.out.println ("Pass element is: " + pass);

        WebElement compa = driver.findElement(By.name("company"));
        System.out.println ("Button element is: " + compa);

        WebElement mob = driver.findElement(By.name("mobile number"));
        System.out.println ("Button element is: " + mob);

        WebElement btn = driver.findElement(By.xpath("//input[@value='Submit']"));
        System.out.println ("Button element is: " + btn);
    }

    @AfterMethod
    public void Close(){
        driver.close();
    }
}
