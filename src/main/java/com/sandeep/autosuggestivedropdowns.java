package com.sandeep;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestivedropdowns {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Type to Select']")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']")); 
        Thread.sleep(2000);
        for(WebElement option : options){
          if(option.getText().equalsIgnoreCase("india")){
            option.click();
          }
        }
        Thread.sleep(2000);
        driver.quit();
    } 
}
