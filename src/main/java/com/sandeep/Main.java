package com.sandeep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
       public static void main( String[] args ) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebElement element = driver.findElement(By.name("email"));
        element.sendKeys("Himanshu Raand");
        // WebElement element2 =  driver.findElement(By.id("pass"));
        WebElement element2 = driver.findElement(By.xpath("//input[@type='password']"));
        element2.sendKeys("lunda le mera");

        WebElement imgelement =  driver.findElement(By.xpath("//h2[@class='_8eso']"));
        System.out.println( imgelement.getText());

        // WebElement btn = driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
        // WebElement btn = driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
        // WebElement btn = driver.findElement(By.cssSelector("._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy"));  
         driver.findElement(By.cssSelector("button[name='login']")).click();
        
        // btn.click();
        Thread.sleep(4000);
        // driver.quit();
}
}