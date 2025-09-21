package com.sandeep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fillform1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        Thread.sleep(2000);
        
        driver.findElement(By.id("username")).sendKeys("54sandy2398");
          Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("22111");
          Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='user']")).click();;
          Thread.sleep(2000);
          driver.findElement(By.id("okayBtn")).click();
          Thread.sleep(2000);
            //okayBtn
        WebElement selectValues= driver.findElement(By.xpath("//select[@class='form-control']"));
        Select dropdown = new Select(selectValues);
        dropdown.selectByValue("teach");
        dropdown.selectByIndex(2);
        dropdown.selectByVisibleText("Consultant");
        Thread.sleep(2000);
        driver.findElement(By.id("terms")).click();
          Thread.sleep(2000);

        
        driver.findElement(By.name("signin")).click();
        System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert')]")).getText()); 
        Thread.sleep(2000);
        driver.quit();

        
    }
    
}
