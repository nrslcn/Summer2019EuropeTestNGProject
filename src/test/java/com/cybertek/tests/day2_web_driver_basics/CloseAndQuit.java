package com.cybertek.tests.day2_web_driver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

//        driver.get("https://practice.cybertekschool.com");
        driver.get("https://www.google.com");

        Thread.sleep(3000);

//        close ()--> closes the current tab
        driver.close();

        driver = new ChromeDriver();
//        driver.get("http://practice.cybertekschool.com/open_new_tab");

        driver.get("https://wwww.google.com");

//      quit() --> closes all opened windows, tabs, pop ups etc...
        driver.quit();

    }
}
