package com.chief;


import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.*;

public class LoginTests extends BaseTestClass {
   
    @Test
    public void loginSuccess() {

        driver.get("http://192.168.49.2:32000/votify-v2");
        String title = driver.getTitle();
        assertEquals("Votify | Remastering polls", title);

        WebElement userEmailInput = driver.findElement(By.id("userEmail"));
        userEmailInput.sendKeys("kim@example.com");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("12345");

        WebElement loginButton = driver.findElement(By.cssSelector(".fxt-btn-fill"));
        loginButton.click();
    }

    @Test
    public void loginFailed() {

        driver.get("http://192.168.49.2:32000/votify-v2");

        String title = driver.getTitle();
        assertEquals("Votify | Remastering polls", title);

        WebElement userEmailInput = driver.findElement(By.id("userEmail"));
        userEmailInput.sendKeys("emails@example.com");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("12345");

        WebElement loginButton = driver.findElement(By.cssSelector(".fxt-btn-fill"));
        loginButton.click();

        String rtitle = driver.getTitle();
        assertEquals("Action Failed !!", rtitle);
    }

   
}
