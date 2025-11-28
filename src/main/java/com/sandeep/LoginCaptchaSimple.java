package com.sandeep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LoginCaptchaSimple {
    public static void main(String[] args) throws InterruptedException {

        // 1. Open browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Open our local login page
        driver.get("file:///D:/Wings1/T12/my-selenium/src/main/java/com/sandeep/login.html");

        // 3. Fill username and password
        driver.findElement(By.id("username")).sendKeys("Sandeep");
        driver.findElement(By.id("password")).sendKeys("Pandit");

        // 4. Read the captcha (example: "7 + 4")
        String captchaText = driver.findElement(By.id("captcha-box")).getText();
        System.out.println("Captcha is: " + captchaText);

        // 5. Split into parts: ["7", "+", "4"]
        String[] parts = captchaText.split(" ");

        // 6. Get the two numbers
        int num1 = Integer.parseInt(parts[0]);  // first number
        int num2 = Integer.parseInt(parts[2]);  // second number

        // 7. Only addition is supported right now
        int answer = num1 + num2;

        System.out.println("Answer = " + answer);

        // 8. Type the answer in the box
        driver.findElement(By.id("captchaInput")).sendKeys(String.valueOf(answer));

        // Optional: Wait a bit to see the result
        Thread.sleep(3000);

        // Close browser (optional)
        // driver.quit();
    }
}