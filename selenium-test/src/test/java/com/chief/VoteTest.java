package com.chief;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ByIdOrName;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoteTest extends BaseTestClass {

    @Test
    public void testVoting() {

        LoginTests loginTests = new LoginTests();
        loginTests.loginSuccess();

        driver.get("http://localhost:8080/votify-v2/vote");

        List<WebElement> choices = driver.findElements(By.cssSelector(".choice-item"));

        // choices.get(1).click();

        // WebElement submitButton = driver.findElement(By.id("submit-btn"));
        WebElement submitButton = driver.findElement(By.cssSelector(".submit-btn"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", submitButton);

        submitButton.click();

        // WebElement successMessage = driver.findElement(By.id("successMessage"));
        // assertEquals("Vote submitted successfully!", successMessage.getText());

    }
}
