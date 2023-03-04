package Day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_SignUpTest {

    /**
     * Go to "https://opencart.abstracta.us/index.php?route=account/login"
     * Click on My Accout
     * Click on Register
     * Fill int he forms with valid information
     * Accept the agreement
     * Click on Continue button
     * Verify that you are signed up
     */

    @Test
    void signUp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        WebElement myAccount = driver.findElement(By.xpath("//a[@title='My Account']"));
        myAccount.click();

        WebElement register = driver.findElement(By.xpath("(//*[@id=\"top-links\"]//a)[3]"));
        register.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("John");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Snow");

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("tarasbolba1@gmail.com");

        WebElement phone = driver.findElement(By.id("input-telephone"));
        phone.sendKeys("6132345678");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("qweerty");

        WebElement passwordConfirm = driver.findElement(By.id("input-confirm"));
        passwordConfirm.sendKeys("qweerty");

        WebElement privacyCheckBox = driver.findElement(By.name("agree"));
        privacyCheckBox.click();

        WebElement continueButton = driver.findElement(By.cssSelector("input[value='Continue']"));
        continueButton.click();

        WebElement successMsg= driver.findElement(By.xpath("//div[@id='content']//p"));

        Assert.assertEquals(successMsg.getText(),
                "Congratulations! Your new account has been successfully created!","Your test didnt pass");
            Thread.sleep(3000);
            driver.quit();

    }


}
