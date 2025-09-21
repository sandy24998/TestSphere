package com.sandeep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClenderHandle3 {
    public static void main(String[] args) throws InterruptedException {

        String Date = "10";
        String Month = "August";
        String Year = "2030";
         WebDriver driver =  new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
         driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
         driver.findElement(By.xpath("//input[@id='datepicker']")).click();
         String Fetch_Month = driver.findElement(By.className("ui-datepicker-month")).getText();
         String Fetch_Year = driver.findElement(By.className("ui-datepicker-year")).getText();
         Thread.sleep(1000);

         while(!(Month.equals(Fetch_Month) && Year.equals(Fetch_Year))){
            driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
            Fetch_Month = driver.findElement(By.className("ui-datepicker-month")).getText();
            Fetch_Year = driver.findElement(By.className("ui-datepicker-year")).getText();

         }
         driver.findElement(By.xpath("//a[text()='17']")).click();
         Thread.sleep(2000);
    }
}
