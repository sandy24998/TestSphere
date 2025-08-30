package com.sandeep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fillform1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        // by id using csSelector
        // driver.findElement(By.cssSelector("#username")).sendKeys("Himanshu");
        // by class using cssSelector
        driver.findElement(By.cssSelector(".form-control")).sendKeys("rahulshettyacademy");

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("learning");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='user']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("okayBtn")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='admin']")).click();
        Thread.sleep(3000);
         WebElement select = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select selectvalue = new Select(select);
        selectvalue.selectByValue("teach");
        Thread.sleep(1000);
        selectvalue.selectByIndex(2);
        Thread.sleep(1000);
        selectvalue.selectByVisibleText("Student");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        driver.quit();
        
    }
    
}
