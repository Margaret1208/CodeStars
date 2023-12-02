package Automation.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
    private WebDriver driver;
    @FindBy (xpath = "(//a[@class='btn-anis-effect']) [1]")
    WebElement btnDangKi;
    @FindBy (id = "txtFirstname")
    WebElement txtFirstName;
    @FindBy (id = "txtEmail")
    WebElement txtEmail;
    @FindBy (id = "txtCEmail")
    WebElement txtCEmail;
    @FindBy (id = "txtPassword")
    WebElement txtPassword;
    @FindBy (id = "txtCPassword")
    WebElement txtCPassword;
    @FindBy (id = "txtPhone")
    WebElement txtPhone;
    @FindBy (xpath = "//button[@class='btn_pink_sm fs16']")
    WebElement btnRegister;
    @FindBy (xpath = "(//a[@class='btn-anis-effect']) [2]")
    WebElement btnDangNhap;
    @FindBy (id = "txtLoginUsername")
    WebElement txtLoginUser;
    @FindBy (id = "txtLoginPassword")
    WebElement txtLoginPass;
    @FindBy (xpath = "(//button[@class='btn btn-lg btn_pink fs18 fleft w100per pass btn_submit'])")
    WebElement btnLogin;
    @FindBy (xpath = "(//div[@class='avatar2'])")
    WebElement btnAVATAR;
    @FindBy (xpath = "(//a[@href='https://alada.vn/thong-tin-ca-nhan'])")
    WebElement btnEdit;
    @FindBy (id = "txtnewpass")
    WebElement txtNewPass;
    @FindBy (id = "txtrenewpass")
    WebElement txtReNewPass;
    @FindBy (xpath = "(//button[@class='btn_blue_sm marleft42per'])[2]")
    WebElement btnSAVE;
    @FindBy (xpath = "(//a[@href='https://alada.vn/tai-khoan/dang-xuat.html'])[1]")
    WebElement btnLogout;
    @FindBy (name = "txtpassword")
    WebElement txtPass;
    public Login_Page(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void RegisterFunction() throws InterruptedException {
        btnDangKi.click();
//        ----------------------------------
        txtFirstName.clear();
        txtFirstName.sendKeys("Inventory");
//        ----------------------------------
        txtEmail.clear();
        txtEmail.sendKeys("abc4@gmail.com");
//        ----------------------------------
        txtCEmail.clear();
        txtCEmail.sendKeys("abc4@gmail.com");
//        ----------------------------------
        txtPassword.clear();
        txtPassword.sendKeys("123456");
//        ----------------------------------
        txtCPassword.clear();
        txtCPassword.sendKeys("123456");
//        ----------------------------------
        txtPhone.clear();
        txtPhone.sendKeys("0987654321");
        btnRegister.click();
        Thread.sleep(2000);
    }

    public void LoginFunction(){
        btnDangNhap.click();

        txtLoginUser.clear();
        txtLoginUser.sendKeys("abc4@gmail.com");

        txtLoginPass.clear();
        txtLoginPass.sendKeys("123456");
        btnLogin.click();
    }
    public void EditFunction () throws InterruptedException {
        LoginFunction();
        Thread.sleep(2000);

        btnAVATAR.click();
        Thread.sleep(2000);
        btnEdit.click();

        txtPass.clear();
        txtPass.sendKeys("123456");

        txtNewPass.clear();
        txtNewPass.sendKeys("12345678");

        txtReNewPass.clear();
        txtReNewPass.sendKeys("12345678");

        btnSAVE.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }
    public void ReLoginPage() throws InterruptedException {
        btnDangNhap.click();
        txtLoginUser.clear();
        txtLoginUser.sendKeys("abc4@gmail.com");

        txtLoginPass.clear();
        txtLoginPass.sendKeys("12345678");
        btnLogin.click();
        Thread.sleep(2000);
    }

    public void LogoutPage() throws InterruptedException {
        ReLoginPage();
        Thread.sleep(2000);

        btnAVATAR.click();
        Thread.sleep(2000);

        btnLogout.click();
    }
}
