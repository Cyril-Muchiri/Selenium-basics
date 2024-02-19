package com.chief;

import static org.junit.Assert.*;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationTests extends BaseTestClass {

    @Test(priority = 1)
    public void registrationSuccess() {

        driver.get("http://192.168.49.2:32000/votify-v2/register");

        String title=driver.getTitle();
        assertEquals("Votify | Remastering polls", title);

        WebElement userNameInput = driver.findElement(By.id("userName"));
        userNameInput.sendKeys("Ndindi Nyoroh");

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("kim@example.com");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("12345");

        WebElement registerButton = driver.findElement(By.cssSelector(".fxt-btn-fill"));
        registerButton.click();

    }

    @Test
    public void registrationFail() {

        driver.get("http://192.168.49.2:32000/votify-v2");

        String title = driver.getTitle();
        assertEquals("Votify | Remastering polls", title);

        WebElement userNameInput = driver.findElement(By.id("userName"));
        userNameInput.sendKeys("Ndindi Nyoroh");

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("invalid-email");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("12345");

        WebElement registerButton = driver.findElement(By.cssSelector(".fxt-btn-fill"));
        registerButton.click();

        String rtitle = driver.getTitle();
        assertEquals("Action Failed !!", rtitle);

    }
}
