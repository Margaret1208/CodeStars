package Automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Factory {
    private WebDriver driver;
    @FindBy (id="email")
    WebElement txtEmail;
    @FindBy (id="password")
    WebElement txtPass;
    @FindBy (xpath="//button[text()='Sign in']")
    WebElement btnSignIn;
    @FindBy (xpath="//a[@id='user-dropdown']")
    WebElement avatar;
    @FindBy (xpath="//a[@href='https://rise.fairsketch.com/signin/sign_out']")
    WebElement btnSignOut;

    public LoginPage_Factory(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(_driver, this);
    }

    public void LoginFunction(String email, String pass){
        txtEmail.clear();
        txtEmail.sendKeys(email);

        txtPass.clear();
        txtPass.sendKeys(pass);

        btnSignIn.click();
    }

    public void LogoutFunction (String email, String pass){
        LoginFunction(email,pass);
        avatar.click();
        btnSignOut.click();
    }
}
