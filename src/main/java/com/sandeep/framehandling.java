package com.sandeep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class framehandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // Use a reasonable implicit wait (e.g., 10 seconds)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        
        // Interact with the element on the main page
        driver.findElement(By.id("name")).sendKeys("Sandeep");

        // Switch to the frame
        driver.switchTo().frame(driver.findElement(By.id("frm1")));

        // Interact with the element inside the frame using the correct select method
        Select select = new Select(driver.findElement(By.id("course")));
        select.selectByVisibleText("Javascript");

        // Switch back to the main page
        driver.switchTo().defaultContent();
        
        // Interact with an element on the main page again
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Sandeep");

        // Use a static wait only for demonstration purposes before closing the browser
        Thread.sleep(5000);
        
        driver.quit();

    }
}
