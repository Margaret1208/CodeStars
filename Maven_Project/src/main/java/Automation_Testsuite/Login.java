package Automation_Testsuite;

import Automation.Page.Login_Page;
import Automation_Common.CommonBase;
import Automation_Contant.CT_Account;
import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class Login extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver(CT_Account.RISE_URL);
    }

    @Test(priority = 1)
    public void ResgisterAccount() throws InterruptedException {
        Login_Page login = new Login_Page(driver);
        login.RegisterFunction();
        assertTrue(driver.findElement(CT_Account.AVATAR).isDisplayed());
    }

    @Test (priority = 2)
    public void EditAcoount() throws InterruptedException {
        Login_Page login = new Login_Page(driver);
        login.EditFunction();
    }

    @Test (priority = 3)
    public void ReLoginAccount() throws InterruptedException {
        Login_Page login = new Login_Page(driver);
        login.ReLoginPage();
        assertTrue(driver.findElement(CT_Account.AVATAR).isDisplayed());
    }

    @Test (priority = 4)
    public void LogoutAccount() throws InterruptedException {
        Login_Page login = new Login_Page(driver);
        login.LogoutPage();
        assertTrue(driver.findElement(CT_Account.BUTTON).isDisplayed());
    }
    @AfterMethod
    public void Close(){
        driver.close();
    }
}
