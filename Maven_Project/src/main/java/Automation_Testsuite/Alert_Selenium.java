package Automation_Testsuite;

import Automation_Common.CommonBase_Demo;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Alert_Selenium extends CommonBase_Demo {
    @BeforeMethod
    public void InitChromeDriver(){
        driver = initChromeDriver("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
    }

    @Test
    public void AlertSelenium() throws InterruptedException {
        click(By.xpath("//button[text()='Try it']"));
        Thread.sleep(5000);
        assertTrue(isElementPresent(By.xpath("//p[text()='Welcome to Selenium WebDriver Tutorials']")));
        driver.switchTo().alert().accept();
    }

//    @AfterMethod
//    public void CloseDriver(){
//        driver.close();
//    }
}
