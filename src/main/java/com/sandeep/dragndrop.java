package com.sandeep;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
        WebElement src = driver.findElement(By.xpath("//div[@class='red']"));
        WebElement src1 = driver.findElement(By.xpath("//div[@class='blue']"));
        WebElement src2 = driver.findElement(By.xpath("//div[@class='green']"));
        WebElement trg = driver.findElement(By.id("target"));

        Actions a = new Actions(driver);
        a.dragAndDrop(src, trg).perform();
        a.dragAndDrop(src1, trg).perform();
        a.dragAndDrop(src2, trg).perform();
        
    }
}
