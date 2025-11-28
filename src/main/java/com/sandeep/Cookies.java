package com.sandeep;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/web/blank.html");
        driver.manage().addCookie(new Cookie("c1", "cook1"));
        driver.manage().addCookie(new Cookie("c2", "cook2"));
        driver.manage().addCookie(new Cookie("c3", "cook3"));
        driver.manage().addCookie(new Cookie("d1", "del1"));

        Set<Cookie> cookies = driver.manage().getCookies();

        for (Cookie cookie : cookies){
            System.out.println(cookie.getValue());
            driver.manage().deleteCookie(cookie);
        }

        driver.manage().deleteCookieNamed("d1"); // Delete with Cookie key value

        driver.manage().addCookie(new Cookie("test1", "cookie1"));
	    driver.manage().addCookie(new Cookie("test2", "cookie2"));
	    // Delete All cookies
	    driver.manage().deleteAllCookies();

        driver.quit();
    }
}
