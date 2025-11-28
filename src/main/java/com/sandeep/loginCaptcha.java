package com.example;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginCaptcha {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.get("file:///D:/T12/selenium_basic/src/main/java/com/example/login.html");
        driver.findElement(By.id("username")).sendKeys("Himanshu");
        driver.findElement(By.id("password")).sendKeys("singh");
        String captcha =  driver.findElement(By.id("captcha-box")).getText();
        System.out.println(captcha);
        String[] parts = captcha.split(" ");
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[2]);
        String finalnum = String.valueOf(num1 + num2);
        System.out.println(finalnum);
        driver.findElement(By.id("captchaInput")).sendKeys(finalnum);
        

       

    }
}
