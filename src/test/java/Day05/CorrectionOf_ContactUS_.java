package Day05;

import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CorrectionOf_ContactUS_ extends DriverClass {
    /**
     * Go to WebPage "https://opencart.abstracta.us/index.php?route=account/login"
     * login
     * Click on COntact Us
     * Send a messege from xml File
     * Check if the URL has "success keyword
     */

    @Test
    void contactUs() throws InterruptedException {
        WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactUs.click();

        WebElement messageInput = driver.findElement(By.id("input-enquiry"));
        messageInput.sendKeys("jankjefnwekjfnwkjefn");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));
//        wait.until(ExpectedConditions.elementToBeClickable(submitButton));

        JavascriptExecutor js=  (JavascriptExecutor)driver;

        Thread.sleep(5);

        js.executeScript("arguments[0].click();", submitButton);

//        js.executeScript("arguments[0].scrollIntoView();",submitButton);


//        submitButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
    }
}
