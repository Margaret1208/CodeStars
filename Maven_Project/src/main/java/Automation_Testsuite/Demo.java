package Automation_Testsuite;

import Automation_Common.CommonBase;
import Automation_Common.CommonBase_Demo;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static net.sf.ezmorph.test.ArrayAssertions.assertEquals;

public class Demo extends CommonBase_Demo {
    @BeforeMethod
    public void InitChromeDriver(){
        driver = initChromeDriver("https://demo.guru99.com/test/delete_customer.php");
    }

    @Test
    public void deleteCustomerSuccessfully(){
        type(By.xpath("//input[@name='cusid']"),"1234");
        click(By.xpath("//input[@name='submit']"));
        String msgConfirm = driver.switchTo().alert().getText();
        assertEquals(msgConfirm, "Do you really want to delete this Customer?");
        driver.switchTo().alert().accept();
        String msgNoti = driver.switchTo().alert().getText();
        assertEquals(msgNoti, "Customer Successfully Delete!");
    }

//    @AfterMethod
//    public void Close(){
//        driver.close();
//    }
}
