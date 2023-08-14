package com.gits.herokuapp.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ValidateLandingPageLinks {

    String expectedUrl = "https://the-internet.herokuapp.com/abtest";

    @Test(priority = 0)
    public void validateLandingPageLinks() throws InterruptedException {

        /*
        - Pre-condition: Chrome
        - Mac & Windows

        - 1. Navigate to the URL on the Chrome browser
        - 2. Validating expected URL
        - Validate links on the landing page
        - How do I get count of the link on landing page
        - Validate, the count of the links and expected links from the reequirment
         */



        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);

        //Assert.assertEquals("Actual", expectedUrl);

        WebElement firstLink = driver.findElement(By.cssSelector("li:nth-of-type(1) > a"));
        firstLink.click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, expectedUrl);
        driver.navigate().back();

        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        int linkCount = linkElements.size();
        Assert.assertEquals(linkCount, 46, "No links found on the webpage.");

        Thread.sleep(1000);
        driver.quit();


    }

    @Test(priority = 1)
    public void validateLogInBtn() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.aa.com/homePage.do");
        Thread.sleep(1000);

        WebElement LogInLink = driver.findElement(By.cssSelector("a#log-in-button"));
        LogInLink.click();


        Thread.sleep(1000);
        driver.quit();
    }
}
