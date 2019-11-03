package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLchanged {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput = driver.findElement(By.name("email"));

        emailInput.sendKeys("email@gmail.com");

        WebElement retrievePasswordButtuon = driver.findElement(By.id("form_submit"));

        retrievePasswordButtuon.click();

        String expectedURL = "http://practice.cybertekschool.com/email_sent";
        String actualURL = driver.getCurrentUrl();
        if (expectedURL.equals(actualURL))
            System.out.println(" PASS ");
        else {
            System.out.println("FAIL");
            System.out.println("actualURL = " + actualURL);
            System.out.println("expectedURL = " + expectedURL);
        }

        driver.quit();
    }
}
