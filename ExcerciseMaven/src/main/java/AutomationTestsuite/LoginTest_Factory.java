package AutomationTestsuite;

import Automation.page.LoginPage_Factory;
import Automation.page.Loginpage;
import AutomationCommon.CommonBase;
import AutomationContant.Ct_Account;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTest_Factory extends CommonBase {
//    private static WebDriver driver;
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver(Ct_Account.RISE_URL);
    }

    @Test(priority = 1)
    public void LoginSuccessfully()
    {
        LoginPage_Factory login = new LoginPage_Factory(driver);
        login.LoginFunction("client@demo.com","riseDemo");
//        assertTrue(driver.findElement(Ct_Account.DASHBOARD_TEXT).isDisplayed());
        assertFalse(isElementPresent(Ct_Account.DASHBOARD_TEXT));
    }

    @Test (priority = 2)
    public void Logout(){
        LoginPage_Factory login = new LoginPage_Factory(driver);
        login.LogoutFunction("client@demo.com","riseDemo");
        assertTrue(driver.findElement(Ct_Account.SIGNIN).isDisplayed());
    }

    @Test (priority = 3)
    public void LoginFailIncorrectEmail()
    {
        LoginPage_Factory login = new LoginPage_Factory(driver);
        login.LoginFunction("client_incorrect@path.com", "riseDemo");
        assertTrue(driver.findElement(Ct_Account.AUTHENTICATION_ALERT).isDisplayed());
    }

//    @Test (priority = 4)
//    public void LoginFailIncorrectPass()
//    {
//        Loginpage login = new Loginpage(driver);
//        login.LoginFunction("client@demo.com","riseDemo_incorrect");
//        assertTrue(driver.findElement(Ct_Account.AUTHENTICATION_ALERT).isDisplayed());
//    }
//
//    @Test (priority = 5)
//    public void LoginFailIncorrectPassAndEmail()
//    {
//        Loginpage login = new Loginpage(driver);
//        login.LoginFunction("client@tre.com","riseDemo_incorrect");
//        assertTrue(driver.findElement(Ct_Account.AUTHENTICATION_ALERT).isDisplayed());
//    }

//    @AfterMethod
//    public void closeDriver() {
//        driver.close();
//    }

}
