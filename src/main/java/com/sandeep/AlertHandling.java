package com.sandeep;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandling {
    public static void main(String[] args) throws InterruptedException {
        
        // 🔹 First test block using Thread.sleep()
        // WebDriver driver1 = new ChromeDriver();
        // driver1.manage().window().maximize();
        // driver1.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        // Thread.sleep(2000);
        // driver1.findElement(By.id("name")).sendKeys("Sandeep");
        // Thread.sleep(2000);
        // driver1.findElement(By.id("confirmbtn")).click();
        // Thread.sleep(2000);
        
        // System.out.println(driver1.switchTo().alert().getText());
        // driver1.switchTo().alert().accept();
        
        // driver1.quit();

        
        // // 🔹 Second test block using implicit wait
        // WebDriver driver2 = new ChromeDriver();
        // driver2.manage().window().maximize();
        // driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // driver2.get("https://rahulshettyacademy.com/AutomationPractice/");
        // driver2.findElement(By.id("name")).sendKeys("Sandeep");
        // driver2.findElement(By.id("confirmbtn")).click();
        
        // // Implicit wait doesn’t work for alerts, but alert appears instantly
        // System.out.println(driver2.switchTo().alert().getText());
        // driver2.switchTo().alert().accept();
        
        // driver2.quit();

        
        // // 🔹 Third test block using explicit wait
        // WebDriver driver3 = new ChromeDriver();
        // driver3.manage().window().maximize();

        // driver3.get("https://www.selenium.dev/selenium/web/alerts.html");

        // driver3.findElement(By.id("alert")).click();
        
        // WebDriverWait wait = new WebDriverWait(driver3, Duration.ofSeconds(10));
        // wait.until(ExpectedConditions.alertIsPresent());
        
        // Alert alert = driver3.switchTo().alert();
        // String text = alert.getText();
        // System.out.println("Alert text - " + text);
        // alert.accept();

        // driver3.quit();

        WebDriver driver4 = new ChromeDriver();
driver4.manage().window().maximize();

driver4.get("file:///D:/Wings1/T12/my-selenium/src/test/resources/prompt.html");

// Wait for the button to be clickable
WebDriverWait wait = new WebDriverWait(driver4, Duration.ofSeconds(10));
WebElement promptBtn = wait.until(ExpectedConditions.elementToBeClickable(
        By.xpath("//button[contains(text(),'Prompt Alert')]")
));
promptBtn.click();

// Wait for the prompt alert
Alert alert1 = wait.until(ExpectedConditions.alertIsPresent());
System.out.println("Alert text: " + alert1.getText());
Thread.sleep(4000);
alert1.sendKeys("Selenium");
Thread.sleep(4000);
alert1.accept();
Thread.sleep(2000);

    }
}
