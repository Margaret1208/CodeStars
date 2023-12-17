package Automation_Testsuite;

import Automation_Common.CommonBase_Demo;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrameMediaMart extends CommonBase_Demo {
    @BeforeMethod
    public void InitChromeDriver(){
        driver = initChromeDriver("https://mediamart.vn/");
    }

    @Test
    public void TestMediaMart () throws InterruptedException {
        pause(10000);
        int totalIFrame = driver.findElements(By.tagName("iframe")).size();
        for (int i = 0; i < totalIFrame; i++) {
            try {
                driver.switchTo().frame(i);
                int TotalbuttonChatZalo = driver.findElements(By.xpath("//div[@class='logo']")).size();
                System.out.println("TotalbuttonChatZalo" + TotalbuttonChatZalo);
                if (TotalbuttonChatZalo != 0) {
                    click(By.xpath("//div[@class='za-chat']"));
                    Thread.sleep(5000);
                    click(By.xpath("//div[text()='Chat nhanh']"));
                    driver.switchTo().defaultContent();
                } else
                    driver.switchTo().defaultContent();
            }
            catch (Exception e) {
                return;
            }
        }
    }
}
