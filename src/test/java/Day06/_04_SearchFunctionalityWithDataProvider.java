package Day06;

import Utilities.DriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _04_SearchFunctionalityWithDataProvider extends DriverClass {
    /**
     * Go to "https://opencart.abstracta.us/index.php?route=account/login"
     * Log in
     * search for mac, samsung, ipod
     * Check all results contains these keywords
     */

    @Test(dataProvider = "searchKeyWord")
    void searchFunctionality(String str) {
        WebElement searchBox = driver.findElement(By.cssSelector("input[type='text']"));
        searchBox.clear();
        searchBox.sendKeys(str);

        WebElement searchButton = driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']"));
        searchButton.click();

        List<WebElement> resultList = driver.findElements(By.cssSelector("h4>a"));

        for (WebElement element : resultList) {
            Assert.assertTrue(element.getText().toLowerCase().contains(str));
        }

    }
        @DataProvider(name = "searchKeyWord")
        public Object[][] searchData(){
            Object[][] dataList ={{"mac"},{"samsung"},{"ipod"}};
            return dataList;
        }
    }

