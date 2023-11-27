package AutomationTestsuite;

import AutomationCommon.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Day12_Exercise extends CommonBase {
    @BeforeMethod
    public void openChrome()
    {
        driver = initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html\r\n");
    }

    @Test
//    public void ClickOnCheckBox() {
//        //Kiểm tra rằng sau khi page được mở thì default checked đã đc check
//        WebElement defaultChecked = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
//        boolean status = defaultChecked.isSelected();
//        System.out.println("Status is: " + status);
//
//        WebElement clickOnThisChb = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
//        if (clickOnThisChb.isSelected() == false){
//            clickOnThisChb.click();
//            System.out.println("Checkbox click on this check box was checked");
//        }
//    }
    public void clickOnMulitCheckbox(){
        List<WebElement> listCheckbox;
        //Lấy tổng số check box
        listCheckbox=driver.findElements(By.xpath("//div[text()='Multiple Checkbox Demo']/following-sibling::div[@class='panel-body']/child::div[@class='checkbox']//input"));
        // Duyet list
        for(int i = 0; i< listCheckbox.size(); i++){
            WebElement checkbox = listCheckbox.get(i);
            if(checkbox.isSelected() == false){
                checkbox.click();
                System.out.println("Check box thứ " +i+1+"đã đc check");
            }
        }
    }
}
