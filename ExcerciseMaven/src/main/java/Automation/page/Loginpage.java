package Automation.page;

import AutomationContant.Ct_Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
    private WebDriver driver;
    public Loginpage(WebDriver _driver)
    {
        this.driver = _driver;
    }
    public void LoginFunction(String emailValue, String passValue)
    {
        //driver.findElement(By.id("email"));
        WebElement email =	driver.findElement(Ct_Account.TEXT_EMAIL);
        if(email.isEnabled())
        {
            email.clear();
            email.sendKeys(emailValue);
        }
        WebElement pass =	driver.findElement(Ct_Account.TEXT_PASSWORD);
        if(pass.isEnabled())
        {
            pass.clear();
            pass.sendKeys(passValue);
        }
        WebElement loginButton =	driver.findElement(Ct_Account.BUTTON_SIGNIN);
        if(pass.isEnabled())
        {
            loginButton.click();
        }
    }
    public void Function(){
        WebElement ava = driver.findElement(Ct_Account.AVATAR);
        if (ava.isEnabled()){
            ava.click();
        }
        WebElement signout = driver.findElement(Ct_Account.LINK_TEXT);
        if (signout.isEnabled()){
            signout.click();
        }
    }
}
