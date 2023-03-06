package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class ParameterDriverClass {

    public WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    @Parameters(value = "browser")
    public void startSettings(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();

        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();

        }

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        login();
    }

    void login() {

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='input-email']"));
        inputEmail.sendKeys("tarasbolba1@gmail.com");

        WebElement inputPassCode = driver.findElement(By.id("input-password"));
        inputPassCode.sendKeys("qweerty");

        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
    }

    @AfterClass(alwaysRun = true)
    public void finishSetting() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }

}
