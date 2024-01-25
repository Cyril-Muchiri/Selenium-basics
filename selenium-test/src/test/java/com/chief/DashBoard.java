package com.chief;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class DashBoard  extends BaseTestClass{

    @Test
    public void testDashboard(){

        LoginTests loginTests = new LoginTests();
        loginTests.loginSuccess();

        driver.get("http://localhost:8080/votify-v2/home");
      
        WebElement titleElement = driver.findElement(By.cssSelector(".h3.mb-0.text-gray-800"));
        assertEquals("Dashboard", titleElement.getText());

        WebElement accountName = driver.findElement(By.cssSelector("h4"));
        assertTrue(!accountName.getText().equals("null"));

        // WebElement nomCount=driver.findElement(By.cssSelector("text-xs font-weight-bold text-primary text-uppercase mb-1"));
        // assertEquals(nomCount.getText(), "TOTAL NOMINEES");

        WebElement linkElement = driver.findElement(By.cssSelector("a[href='./create']"));
        linkElement.click();
    }


    @Test
    public void testDashboardLink() {
        WebElement dashboardLink = driver.findElement(By.xpath("//a[@href='./home']"));
        dashboardLink.click();
        assertEquals("http://localhost:8080/votify-v2/home", driver.getCurrentUrl());
       
    }

    @Test
    public void testActivePollsLink() {
        WebElement activePollsLink = driver.findElement(By.xpath("//a[@href='./active']"));
        activePollsLink.click();
        assertEquals("http://localhost:8080/votify-v2/active", driver.getCurrentUrl());
       
    }

    @Test
    public void testCreatePollLink() {
        WebElement createPollLink = driver.findElement(By.xpath("//a[@href='./create']"));
        createPollLink.click();
        assertEquals("http://localhost:8080/votify-v2/create", driver.getCurrentUrl());
     
    }



    @Test
    public void testSignOutLink() {
        WebElement signOutLink = driver.findElement(By.xpath("//a[@href='./logout']"));
        signOutLink.click();
    }

    @Test
    public void testPollDescription() {
        WebElement pollDescription = driver.findElement(By.xpath("//div[@class='card__description']/p"));
        assertTrue(pollDescription.isDisplayed());
     
    }

    @Test
    public void testEntertainmentPollLink() {
        WebElement entertainmentPollLink = driver.findElement(By.xpath("//a[@href='#']"));
        entertainmentPollLink.click();
      
    }

    @Test
    public void testToggleNavbar() {
        WebElement toggleButton = driver.findElement(By.id("header-toggle"));
        toggleButton.click();
        
    }

}
