package com.chief;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests extends BaseTestClass {
   
    @Test
    public void loginSuccess() {

        driver.get("http://localhost:8080/votify-v2");
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

        driver.get("http://localhost:8080/votify-v2");
        
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

    @AfterAll
    public static void destroy() {
        driver.quit();
    }
}
