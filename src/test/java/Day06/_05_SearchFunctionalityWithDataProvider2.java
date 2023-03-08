package Day06;

import Utilities.DriverClass;
import Utilities.ParameterDriverClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _05_SearchFunctionalityWithDataProvider2 extends ParameterDriverClass {

    /**
     * Go to "https://opencart.abstracta.us/index.php?route=account/login"
     * Log in
     * search for mac, samsung, ipod by using data provider
     * Check all results contains these keywords
     * extend to / use ParameterDriverClass and run the test for different browsers parallel
     *
     * (For my notes)---we ran this from the XML Files we had to create one
     * */

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
