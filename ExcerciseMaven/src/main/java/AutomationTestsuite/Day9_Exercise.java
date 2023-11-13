package AutomationTestsuite;

import AutomationCommon.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day9_Exercise extends CommonBase {
    @BeforeTest
    public void openChrome(){
        driver = initChromeDriver("https://chercher.tech/practice/dynamic-table");
    }

    @Test
    public void TestsEx(){
        WebElement email = driver.findElement(By.xpath("//button[@id='blue']"));
        System.out.println ("Blueberrt: " + email);

        WebElement pass = driver.findElement(By.xpath("(//div[@id='pancakes'])[2]/button[2]"));
        System.out.println ("Orange: " + pass);

        WebElement compa = driver.findElement(By.xpath("(//div[@id='unique'])[1]/button[3]"));
        System.out.println ("Juice: " + compa);

        WebElement mob = driver.findElement(By.xpath("(//div[@id='unique'])[2]/button[1]"));
        System.out.println ("Banana: " + mob);

        WebElement btn = driver.findElement(By.xpath("(//div[@id='unique'])[2]/button[3]"));
        System.out.println ("BananaJuice: " + btn);

        WebElement bbn = driver.findElement(By.xpath("(//div[@id='unique'])[2]/input[@value='     Zack    Snyder    ']"));
        System.out.println ("jackSnyder: " + bbn);
    }

    @AfterMethod
    public void Close(){
        driver.close();
    }
}
