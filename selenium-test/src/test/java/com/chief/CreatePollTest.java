package com.chief;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatePollTest extends BaseTestClass {

    @Test
    public void testFormNavigation() {
        LoginTests loginTests = new LoginTests();
        loginTests.loginSuccess();

        driver.get("http://localhost:8080/votify-v2/topics");

        WebElement userNameInput = driver.findElement(By.name("topicName"));
        userNameInput.sendKeys("Test Topic");

        WebElement choicesNumInput = driver.findElement(By.name("choicesNum"));
        choicesNumInput.sendKeys("2");

        for (int i = 1; i <= 2; i++) {
            WebElement choiceInput = driver.findElement(By.name("choice" + i));
            choiceInput.sendKeys("Choice " + i);
        }

        WebElement deadlineInput = driver.findElement(By.name("Deadline"));
        deadlineInput.sendKeys("2022-01-01");

        WebElement nextBtn = driver.findElement(By.id("nextBtn"));
        nextBtn.click();

        // WebDriverWait wait = new WebDriverWait(driver, 10);

        
        // wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("#choicesContainer input"), 0));

        assertChoice(driver, 1, "Choice 1 Value");
        assertChoice(driver, 2, "Choice 2 Value");

        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        submitBtn.click();
    }

    private static void assertChoice(WebDriver driver, int choiceNumber, String expectedValue) {
        WebElement choice = driver.findElement(By.name("choice" + choiceNumber));
        assertEquals(expectedValue, choice.getAttribute("value"));
    }
}
