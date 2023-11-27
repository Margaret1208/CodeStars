package AutomationContant;

import org.openqa.selenium.By;

public class Ct_Account {
    public static String RISE_URL = "https://rise.fairsketch.com/signin";
    public static By TEXT_EMAIL = By.xpath("//div[@class='form-group']/input[@id='email']");
    public static By TEXT_PASSWORD = By.xpath("//div[@class='form-group']/input[@id='password']");
    public static By BUTTON_SIGNIN = By.xpath("//button[text()='Sign in']");
    public static By DASHBOARD_TEXT = By.xpath("//span[text()='Dashboard' and @class='menu-text ']");
    public static By AUTHENTICATION_ALERT = By.xpath("//div[normalize-space()='Authentication failed!']");
    public static By AVATAR = By.xpath("//a[@id='user-dropdown']");
    public static By LINK_TEXT = By.xpath("//a[@href='https://rise.fairsketch.com/signin/sign_out']");
    public static By SIGNIN = By.xpath("//div[@class='card-header text-center']/h2");
}
