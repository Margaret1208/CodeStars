package AutomationTestsuite;

import AutomationCommon.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day12_Dropdown extends CommonBase {
    @BeforeMethod
    public void openChrome()
    {
        driver = initChromeDriver("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html\r\n");
    }

    @Test
    public void SelectOneOption() throws InterruptedException {
        WebElement selectTag = driver.findElement(By.id("select-demo"));
        Select dropdownlist = new Select(selectTag);
        System.out.println("dropdownlist.isMultiple()"+dropdownlist.isMultiple());
        System.out.println("dropdownlist size"+dropdownlist.getOptions().size());
        selectTag.click();
        dropdownlist.selectByValue("Sunday");
        System.out.println("dropdownlist first option is "+dropdownlist.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        //Chon Monday bang VisibleText
        selectTag.click();
        dropdownlist.selectByVisibleText("Monday");
        System.out.println("dropdownlist first option is "+dropdownlist.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        // Chon Tuesday bang cach Index
        selectTag.click();
        dropdownlist.selectByIndex(3);
        System.out.println("dropdownlist first option is "+dropdownlist.getFirstSelectedOption().getText());
    }
}
