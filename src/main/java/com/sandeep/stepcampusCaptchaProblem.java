package com.sandeep;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stepcampusCaptchaProblem {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.get("https://www.stepcampus.in/signup");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hi@stepcampus.in");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Stepcampus@123");
        Thread.sleep(2000);
        String label = driver.findElement(By.xpath("//label[@for='«r0»-form-item']")).getText();
        // System.out.println(label);
        Thread.sleep(2000);
        char[] text_captcha =  label.toCharArray();
        System.out.println(text_captcha);
        int num1 = text_captcha[8] - '0';
        int num2 = text_captcha[12] - '0';
        char operation = text_captcha[10];
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(operation);

        int result = 0;
        if(operation == '+'){
            result = num1 + num2;
        }
        if(operation == '-'){
            result = num1 - num2;
        }
        if(operation == '*'){
            result = num1 * num2;
        }
        if(operation == '/'){
            result = num1 / num2;
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder = 'Your answer']")).sendKeys(String.valueOf(result));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type= 'submit']")).click();




    }
}
