package com.sandeep;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClenderHandle2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demoqa.com/date-picker?utm_source=chatgpt.com");
        driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).click();
        driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
        // Locate dropdown
        WebElement dropdown  = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        // Create Select object
        Select select = new Select(dropdown);
        
        //  Different ways to select
        //  select.selectByIndex(1);       
        // select.selectByValue("2");     
        select.selectByVisibleText("2000"); 

        driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
        WebElement selectMonth = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));

        Select selectmonth = new Select(selectMonth);
        selectmonth.selectByContainsVisibleText("September");
        driver.findElement(By.xpath("//div[@class='react-datepicker__header__dropdown react-datepicker__header__dropdown--select']")).click();

        driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day--017')]")).click();

    }
}
