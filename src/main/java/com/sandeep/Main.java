package com.sandeep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.google.com");
        Thread.sleep(2000);
    }
}