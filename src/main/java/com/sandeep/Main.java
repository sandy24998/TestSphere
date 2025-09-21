package com.sandeep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
       public static void main( String[] args ) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//h2[@class='_8eso']")).getText());
        WebElement gid = driver.findElement(By.id("email"));
        gid.sendKeys("Himramd@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("himanshu211");
        Thread.sleep(2000); 
        driver.findElement(By.cssSelector("button[name='login']")).click();
        Thread.sleep(2000); 
        driver.quit();
}
}