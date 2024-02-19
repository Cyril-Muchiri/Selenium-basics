package com.chief;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class BaseTestClass {

    protected static WebDriver driver;

    @BeforeMethod
    public void setUp() {
        FirefoxOptions options=new FirefoxOptions();
        options.setProfile(new FirefoxProfile(new File("/home/chief/Desktop/projects/profile")));
        // options.addArguments("-headless");
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
