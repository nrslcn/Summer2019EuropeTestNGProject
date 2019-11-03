package com.cybertek.tests.day2_web_driver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateDemo {

    public static void main(String[] args) throws InterruptedException {

        // setting up the browser
        WebDriverManager.chromedriver().setup();

        WebDriver driver =  new ChromeDriver();

        //navigate to website
        driver.get("https://amazon.com");

        // another way of opening web site
        driver.navigate().to("https://www.facebook.com");

        driver.navigate().back();

        Thread.sleep(300);
        driver.navigate().forward();


    }
}
