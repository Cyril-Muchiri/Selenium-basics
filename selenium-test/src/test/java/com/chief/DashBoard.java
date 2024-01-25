package com.chief;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class DashBoard  extends BaseTestClass{

    @Test
    public void testTitle(){

        LoginTests loginTests = new LoginTests();
        loginTests.loginSuccess();

        driver.get("http://localhost:8080/votify-v2/home");
      
        WebElement titleElement = driver.findElement(By.cssSelector(".h3.mb-0.text-gray-800"));
        assertEquals("Dashboard", titleElement.getText());
    }

}
