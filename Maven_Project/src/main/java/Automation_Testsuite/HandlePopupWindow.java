package Automation_Testsuite;

import Automation_Common.CommonBase_Demo;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

import static net.sf.ezmorph.test.ArrayAssertions.assertEquals;

public class HandlePopupWindow extends CommonBase_Demo {
    @BeforeMethod
    public void InitChromeDriver(){
        driver = initChromeDriver("https://demo.guru99.com/popup.php");
    }

    @Test
    public void TestDemoGuru (){
        click(By.xpath("//a[text()='Click Here']"));
        Set<String> listWindows = driver.getWindowHandles();
        String mainWindow = driver.getWindowHandle();
        for (String ChildWindow : listWindows){
            if(!ChildWindow.equalsIgnoreCase(mainWindow)){
                driver.switchTo().window(ChildWindow);
                type(By.name("emailid"),"test123@gmail.com");
                click(By.name("btnLogin"));
                isElementPresent(By.xpath("//h2[text()='Access details to demo site.']"));
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
        assertEquals(driver.getCurrentUrl(),"https://demo.guru99.com/popup.php");
    }
}
