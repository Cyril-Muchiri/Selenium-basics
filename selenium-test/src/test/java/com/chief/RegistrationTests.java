package com.chief;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationTests extends BaseTestClass {

    @Test
    public void registrationSuccess() {

        driver.get("http://localhost:8080/votify-v2/register");

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

        driver.get("http://localhost:8080/votify-v2/register");

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
