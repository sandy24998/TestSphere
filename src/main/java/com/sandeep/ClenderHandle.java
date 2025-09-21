package com.sandeep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClenderHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        String year = "2000";
        String Month = "9";
        String Date = "17";

        driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='‹']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='1991 – 2000']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
        Thread.sleep(2000);
        driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']")).get(Integer.parseInt(Month)-1).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//abbr[text()='"+Date+"']")).click();

        Thread.sleep(4000);
        driver.quit();



    
    }
}
