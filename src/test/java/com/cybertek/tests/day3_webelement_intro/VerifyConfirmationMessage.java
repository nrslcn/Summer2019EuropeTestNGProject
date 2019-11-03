package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput = driver.findElement(By.name("email"));

        String expectedEmail = "test@gmail.com";

        emailInput.sendKeys(expectedEmail);

                // get value of attributes
        String actualEmail = emailInput.getAttribute("value");

        if (expectedEmail.equals(actualEmail))
            System.out.println("PASS");
        else {
            System.out.println("FAIL");
            System.out.println("actualEmail = " + actualEmail);
            System.out.println("expectedEmail = " + expectedEmail);

        }

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String expectedMessage = "Your e-mail's been sent!";

        WebElement messageElement = driver.findElement(By.name("confirmation_message"));
        System.out.println(messageElement);

        String actualMessage = messageElement.getText();

        if (expectedMessage.equals(actualMessage))
            System.out.println("PASS");
        else
        {
            System.out.println("FAIL");
            System.out.println("actualMessage = " + actualMessage);
            System.out.println("expectedMessage = " + expectedMessage);
        }







    }
    //open browser

}
