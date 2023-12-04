package AutomationTestsuite;

import Automation.page.ClientPage;
import Automation.page.LoginPage_Factory;
import Automation.page.TrizenPage;
import AutomationCommon.CommonBase;
import AutomationContant.Ct_Account;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TrizenTest extends CommonBase {
    @BeforeMethod
    public void openChrome(){
        driver = initChromeDriver((Ct_Account.TRIZEN_URL));
    }

    @Test
    public void AddClientSuccessful() throws InterruptedException {
        TrizenPage trizen = new TrizenPage(driver);
        trizen.HandleDateTimeAndDropdownlist();
        assertTrue(driver.findElement(By.xpath("//h2[text()='Flight Search Result']")).isDisplayed());
    }
}
