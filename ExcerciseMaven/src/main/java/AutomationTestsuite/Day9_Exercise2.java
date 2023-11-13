package AutomationTestsuite;

import AutomationCommon.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day9_Exercise2 extends CommonBase {
    @BeforeTest
    public void openChrome(){
        driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
    }

    @Test
    public void TestsEx(){
        WebElement email = driver.findElement(By.xpath("//table[@id='resultTable']//tr[@class='usr_acn'][2]"));
        System.out.println ("JohnSmith: " + email);

        WebElement pass = driver.findElement(By.xpath("//table[@id='resultTable']//tr[@class='plan rit'][2]"));
        System.out.println ("JordanMathews: " + pass);

        WebElement compa = driver.findElement(By.xpath("//table[@id='resultTable']//tr[@class='plan rit'][3]"));
        System.out.println ("KevinMathews  " + compa);
    }

    @AfterMethod
    public void Close(){
        driver.close();
    }
}
