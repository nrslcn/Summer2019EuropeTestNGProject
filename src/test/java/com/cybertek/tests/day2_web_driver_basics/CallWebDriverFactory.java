package com.cybertek.tests.day2_web_driver_basics;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {

    public static void main(String[] args) {

       WebDriver driver = WebDriverFactory.getDriver("firefox");

       driver.get("https://www.google.com");


    }
}
