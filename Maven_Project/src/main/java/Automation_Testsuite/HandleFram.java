package Automation_Testsuite;

import Automation_Common.CommonBase_Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleFram extends CommonBase_Demo {
    @BeforeMethod
    public void InitChromeDriver(){
        driver = initChromeDriver("https://codestar.vn/");
    }

    @Test
    public void TestCodeStar (){
        pause(5000);
        //IFrame 1
//        int totalIFrame = driver.findElements(By.tagName("iframe")).size();
//        for (int i =0; i < totalIFrame; i++){
//            driver.switchTo().frame(i);
//            int TotalbuttonGuiNgay = driver.findElements(By.xpath("//button[text()='Gửi ngay']")).size();
//            System.out.println("TotalbuttonGuiNgay" + TotalbuttonGuiNgay);
//            if(TotalbuttonGuiNgay!=0){
//                type(By.id("account_phone"),"0987654321");
//                click(By.xpath("//button[text()='Gửi ngay']"));
//                isElementPresent(By.xpath("//button[text()='Gửi ngay']"));
//                driver.switchTo().defaultContent();
//            }
//            else
//                driver.switchTo().defaultContent();

//        }
        //iFrame 2
        int totalIFrame = driver.findElements(By.tagName("iframe")).size();
        for (int i =0; i < totalIFrame; i++){
            driver.switchTo().frame(i);
            int TotalbuttonĐKNgay = driver.findElements(By.xpath("//button[text()='Đăng kí ngay']")).size();
            System.out.println("TotalbuttonGuiNgay" + TotalbuttonĐKNgay);
            if(TotalbuttonĐKNgay!=0){
                type(By.name("account_name"),"Hannah");
                type(By.id("account_phone"),"0987654321");
                click(By.xpath("//button[text()='Đăng kí ngay']"));
                isElementPresent(By.xpath("//button[text()='Đăng kí ngay']"));
                driver.switchTo().defaultContent();
            }
            else
                driver.switchTo().defaultContent();

        }
    }
//    public void Homework () {
//        pause(5000);
//        int totalIFrame = driver.findElements(By.tagName("iframe")).size();
//        for (int i = 0; i < totalIFrame; i++) {
//            driver.switchTo().frame(i);
//            int TotalbuttonGuiNgay = driver.findElements(By.xpath("//button[text()='Gửi ngay']")).size();
//            System.out.println("TotalbuttonGuiNgay" + TotalbuttonGuiNgay);
//            if (TotalbuttonGuiNgay != 0) {
//                type(By.id("account_phone"), "0987654321");
//                click(By.xpath("//button[text()='Gửi ngay']"));
//                isElementPresent(By.xpath("//button[text()='Gửi ngay']"));
//                driver.switchTo().defaultContent();
//            } else
//                driver.switchTo().defaultContent();
//
//        }
//    }
}
