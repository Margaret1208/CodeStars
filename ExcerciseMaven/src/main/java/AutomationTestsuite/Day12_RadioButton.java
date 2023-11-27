package AutomationTestsuite;

import AutomationCommon.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Day12_RadioButton extends CommonBase {
    @BeforeMethod
    public void openChrome()
    {
        driver = initChromeDriver("https://demo.seleniumeasy.com/basic-radiobutton-demo.html\r\n");
    }

    @Test
    public void testCheckbox() {
        WebElement rdMale = driver.findElement(By.xpath("//input[@value='Male']"));
        WebElement rdFemale = driver.findElement(By.xpath("//input[@value='Female']"));
        System.out.println("Trang thai cua radio male la: "+ rdMale.isSelected());
        System.out.println("Trang thai cua radio female la: "+ rdFemale.isSelected());
        // Kiem tra radio chua duoc check
        if (rdMale.isEnabled() && rdMale.isSelected() == false){
            rdMale.click();
        }
    }
}
