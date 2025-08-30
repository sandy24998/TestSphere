package com.sandeep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_handling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys("himanshu");
        Thread.sleep(1000);
        // driver.findElement(By.id("alertbtn")).click();
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(1000);
        System.out.println(driver.switchTo().alert().getText());
        // driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();

        // note:- any alert type we can handle with this line of code, if ok/confirm is there --> .accept() and if cancel/no --> .dismiss()
         Thread.sleep(1000);
        driver.quit();

    }
}
