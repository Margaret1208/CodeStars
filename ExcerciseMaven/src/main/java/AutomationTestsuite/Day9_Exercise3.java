package AutomationTestsuite;

import AutomationCommon.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day9_Exercise3 extends CommonBase {
    @BeforeTest
    public void openChrome(){
        driver = initChromeDriver("https://www.google.com/");
    }

    @Test
    public void TestsEx(){
        WebElement email = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        System.out.println ("Background: " + email);

        WebElement pass = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
        System.out.println ("Tìm kiếm google: " + pass);

        WebElement compa = driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]"));
        System.out.println ("Xem trang đầu tiên tìm được: " + compa);
    }

    @AfterMethod
    public void Close(){
        driver.close();
    }
}
