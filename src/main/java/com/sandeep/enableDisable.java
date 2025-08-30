package com.sandeep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enableDisable {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(2000);

        String status1 = driver.findElement(By.xpath("//div[@class='picker-second']")).getAttribute("style");
        // System.out.println(status1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='picker-second']")).click();
        Thread.sleep(2000);
        String status2 = driver.findElement(By.xpath("//div[@class='picker-second']")).getAttribute("style");
        // System.out.println(status2);

        if(status2.contains("display: block; opacity: 1;")){
            System.out.println("btn is enable");
        }else{
            System.out.println("btn is disable");
        }



        driver.quit();
    }
    
}
