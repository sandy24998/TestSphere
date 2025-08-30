package com.sandeep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit {

    public static void main(String[] args) throws InterruptedException {
           WebDriver driver = new ChromeDriver();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector(".form-control")).sendKeys("rahulshettyacademy");

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("learning");
      
        driver.findElement(By.xpath("//input[@value='user']")).click();
        
        
    }
  
}
