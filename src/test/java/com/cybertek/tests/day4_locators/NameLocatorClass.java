package com.cybertek.tests.day4_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorClass {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput =  driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("abc@gmail.com");

        WebElement emailSignUp = driver.findElement(By.name("wooden_spoon"));
        emailSignUp.click();

        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";
        WebElement messageElement = driver.findElement(By.name("signup_message"));
        String actualMessage = messageElement.getText();
        System.out.println(actualMessage);

       if (expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }

       WebElement stringTagName = driver.findElement(By.tagName("h3"));
        System.out.println("hello");
        System.out.println(stringTagName.getText());
        //close the browser
        driver.quit();




    }





}
