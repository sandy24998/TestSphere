package com.sandeep;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.*;

public class T12_Problem {
    public static void main(String[] args) throws InterruptedException {

        // Setup ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // 1. Open the local HTML file
            driver.get("file:///D:/Wings1/T12/my-selenium/src/main/java/com/sandeep/T12_Problem.html");

            // 2. Click the button 3 times → opens 3 new tabs
            WebElement button = driver.findElement(By.id("openTabBtn")); // Correct button ID from HTML

            for (int i = 0; i < 3; i++) {
                button.click();
                Thread.sleep(1500); // Give time for tab to open and load content
            }

            // 3. Get all window handles
            Set<String> allTabs = driver.getWindowHandles();
            System.out.println(allTabs);

            List<String> tabsList = new ArrayList<>(allTabs);
            System.out.println(tabsList);


            // tabsList.get(0) = main tab
            // tabsList.get(1) = Tab 1
            // tabsList.get(2) = Tab 2  
            // tabsList.get(3) = Tab 3 (with table)

            String tab1 = tabsList.get(1);
            String tab2 = tabsList.get(2);
            String tab3 = tabsList.get(3);

            String textFromTab1 = "";
            String textFromTab2 = "";

            // === Extract text from Tab 1 ===
            driver.switchTo().window(tab1);
            Thread.sleep(1000);
            textFromTab1 = driver.findElement(By.tagName("body")).getText();
            System.out.println("=== Text from Tab 1 ===");
            System.out.println(textFromTab1);
            System.out.println();

            // === Extract text from Tab 2 ===
            driver.switchTo().window(tab2);
            Thread.sleep(1000);
            textFromTab2 = driver.findElement(By.tagName("body")).getText();
            System.out.println("=== Text from Tab 2 ===");
            System.out.println(textFromTab2);
            System.out.println();

            // === Go to Tab 3 and calculate average from the sales table ===
            driver.switchTo().window(tab3);
            Thread.sleep(2000);

            // Get only the sales amount cells (2nd column)
            List<WebElement> salesCells = driver.findElements(By.xpath("//table//tr/td[2]"));
            // Or: By.cssSelector("table tr td:nth-child(2)");

            double sum = 0;
            int count = 0;

            System.out.println("=== Sales Data from Tab 3 ===");
            for (WebElement cell : salesCells) {
                String valueText = cell.getText().trim().replace(",", ""); // removes thousand separator if any
                try {
                    double value = Double.parseDouble(valueText);
                    System.out.println("Found sales: $" + value);
                    sum += value;
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Skipped non-number: " + valueText);
                }
            }

            double average = count > 0 ? sum / count : 0;

            System.out.println("\n--- Final Result ---");
            System.out.println("Total months: " + count);
            System.out.println("Total sales: $" + sum);
            System.out.println("Average monthly sales: $" + average); // Expected: 59000.0

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Uncomment to close browser after execution
            // Thread.sleep(5000);
           // driver.quit();
        }
    }
}