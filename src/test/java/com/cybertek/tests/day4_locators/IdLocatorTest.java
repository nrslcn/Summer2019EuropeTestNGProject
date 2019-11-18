package com.cybertek.tests.day4_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class IdLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // makes browser page maximized
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
    }
}
