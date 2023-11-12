package AutomationTestsuite;

import AutomationCommon.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class Login extends CommonBase {

    @BeforeTest
    public void openChrome(){
        driver = initChromeDriver("https://bepantoan.vn/");
    }

    @Test
    public void TestsEx(){
        System.out.println("Hello my first project!");
        WebElement link = driver.findElement(By.partialLinkText("Máy Hút Mùi Cổ Điển"));
        System.out.println("Locator của link là: " + link);

        WebElement btn = driver.findElement(By.className("cursor-pointer"));
        System.out.println ("Button element is: " + btn);

        WebElement btn1 = driver.findElement(By.tagName("input"));
        System.out.println ("Button element is: " + btn1);
    }

    @AfterMethod
    public void Close(){
        driver.close();
    }
}
