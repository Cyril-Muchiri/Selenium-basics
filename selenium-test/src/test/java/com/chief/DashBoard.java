package com.chief;

import static org.junit.Assert.*;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class DashBoard  extends BaseTestClass{

    @Test(priority = 3)
    public void testDashboard(){

        LoginTests loginTests = new LoginTests();
        loginTests.loginSuccess();

        driver.get("http://192.168.49.2:32000/votify-v2/home");
      
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
        LoginTests loginTests = new LoginTests();
        loginTests.loginSuccess();

        driver.get("http://192.168.49.2:32000/votify-v2/home");
        WebElement dashboardLink = driver.findElement(By.cssSelector("a[@href='./home']"));
        dashboardLink.click();
       
    }

    @Test
    public void testActivePollsLink() {
        LoginTests loginTests = new LoginTests();
        loginTests.loginSuccess();

        driver.get("http://192.168.49.2:32000/votify-v2/home");
        WebElement activePollsLink = driver.findElement(By.cssSelector("a[@href='./active']"));
        activePollsLink.click();

       
    }

    @Test
    public void testCreatePollLink() {
        LoginTests loginTests = new LoginTests();
        loginTests.loginSuccess();

        driver.get("http://192.168.49.2:32000/votify-v2/home");
        WebElement createPollLink = driver.findElement(By.cssSelector("a[@href='./create']"));
        createPollLink.click();
     
    }



    @Test
    public void testSignOutLink() {
        LoginTests loginTests = new LoginTests();
        loginTests.loginSuccess();

        driver.get("http://192.168.49.2:32000/votify-v2/home");
        WebElement signOutLink = driver.findElement(By.cssSelector("a[@href='./logout']"));
        signOutLink.click();
    }

    @Test
    public void testPollDescription() {
        LoginTests loginTests = new LoginTests();
        loginTests.loginSuccess();

        driver.get("http://192.168.49.2:32000/votify-v2/home");
        WebElement pollDescription = driver.findElement(By.cssSelector("div[@class='card__description']/p"));
        assertTrue(pollDescription.isDisplayed());
     
    }

    // @Test
    // public void testEntertainmentPollLink() {
    //     WebElement entertainmentPollLink = driver.findElement(By.cssSelector("a[@href='#']"));
    //     entertainmentPollLink.click();
      
    // }

    // @Test
    // public void testToggleNavbar() {
    //     // WebElement toggleButton = driver.findElement(By.id("header-toggle"));
    //     // toggleButton.click();
        
    // }

}
