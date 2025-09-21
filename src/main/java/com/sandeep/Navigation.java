package com.sandeep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    Thread.sleep(2000); 
    driver.get("https://selenium.dev");
    Thread.sleep(2000); 
    driver.navigate().to("https://selenium.dev");
    Thread.sleep(2000); 
    String title = driver.getTitle();
    System.out.println(title);
    //Back
    driver.navigate().back();
    title = driver.getTitle();
    System.out.println("Back ---> " + title);
    //Forward
    driver.navigate().forward();
    title = driver.getTitle();
    System.out.println("Forward ---> " + title); 
    //Refresh
    driver.navigate().refresh();
    title = driver.getTitle();
    System.out.println("Refresh ---> " + title);
    driver.quit();
    }
}
