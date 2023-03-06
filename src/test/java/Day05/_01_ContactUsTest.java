package Day05;

import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_ContactUsTest extends DriverClass {

    /**
     * Go to WebPage "https://opencart.abstracta.us/index.php?route=account/login"
     * login
     * Click on COntact Us
     * Send a messege from xml File
     * Check if the URL has "success keyword
     */

    @Test
    @Parameters({"message1"}) // this name must be the same with the name in the xml file
    void contactUs(String message1) throws InterruptedException {
        WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactUs.click();

        WebElement messageInput = driver.findElement(By.id("input-enquiry"));
        messageInput.sendKeys(message1);

        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));

        JavascriptExecutor js=  (JavascriptExecutor)driver;

        Thread.sleep(1000);

//        js.executeScript("arguments[0].scrollIntoView();",submitButton);

        js.executeScript("arguments[0].scrollIntoView();",submitButton);
        submitButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
    }

    @Test
    @Parameters({"message1","message2"}) // this name must be the same with the name in the xml file
    void contactUs1(String message1, String message2) throws InterruptedException {
        WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        contactUs.click();

        WebElement messageInput = driver.findElement(By.id("input-enquiry"));
        messageInput.sendKeys(message1);
        messageInput.sendKeys(message2);



        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));

        JavascriptExecutor js=  (JavascriptExecutor)driver;

        Thread.sleep(1000);

//        js.executeScript("arguments[0].scrollIntoView();",submitButton);

         js.executeScript("arguments[0].scrollIntoView();",submitButton);
        submitButton.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
    }
}
