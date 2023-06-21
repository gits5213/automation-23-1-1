package com.gits.herokuapp.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidateLandingPageLinks {

    @Test
    public void validateLandingPageLinks() throws InterruptedException {

        /*
        - Pre-condition: Chrome
        - Mac & Windows

        - Navigate to the URL on the Chrome browser
        - Validating expected URL
        - Validate 44 links on the landing page
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(5000);
        driver.quit();

    }
}
